package com.eter.gtw.security;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.xml.bind.DatatypeConverter;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

import com.auth0.jwt.Algorithm;
import com.auth0.jwt.JWTSigner;
import com.auth0.jwt.JWTSigner.Options;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.JWTVerifyException;

public class JwtUtil {
    private static final Logger LOGGER = Logger.getLogger(JwtUtil.class);

    private String issuer;
    private String audience;
    private String secret = "test";
    private String algorithm = "HS256";
    private String subject;
    private Long issuedAt = System.currentTimeMillis() / 1000L;
    private Long expiredAt = issuedAt + 3600L;
    private String jwtid;
    private Map<String, String> params;
    private PrivateKey key;

    public JwtUtil() {

    }

    public JwtUtil(String issuer, String audience) {
        this.issuer = issuer;
        this.audience = audience;
    }

    public String generateToken() throws Exception {
        LOGGER.debug("issuer:" + issuer);
        LOGGER.debug("algorithm:" + algorithm);
        LOGGER.debug("audience:" + audience);
        LOGGER.debug("jwtid:" + jwtid);
        LOGGER.debug("secret:" + secret);
        LOGGER.debug("subject:" + subject);

        final JWTSigner signer = (StringUtils.isEmpty(algorithm)
                ? (new JWTSigner(DatatypeConverter.parseBase64Binary(secret)))
                : (!StringUtils.isEmpty(algorithm) && (algorithm.trim().toUpperCase().startsWith("HS")))
                ? (new JWTSigner(DatatypeConverter.parseBase64Binary(secret))) : (new JWTSigner(key)));
        final HashMap<String, Object> claims = new HashMap<String, Object>();
        claims.put("iss", issuer);
        claims.put("aud", audience);
        claims.put("exp", expiredAt);
        claims.put("iat", issuedAt);
        claims.put("nbf", issuedAt);
        claims.put("jti", UUID.randomUUID().toString());
        claims.put("sub", subject);
        if (params != null && params.size() > 0) {
            claims.putAll(params);
        }

        Options options = new Options();
        if (StringUtils.isEmpty(algorithm)) {
            options = null;
        } else {
            if (algorithm.trim().equalsIgnoreCase("HS256")) {
                options.setAlgorithm(Algorithm.HS256);
            } else if (algorithm.trim().equalsIgnoreCase("HS384")) {
                options.setAlgorithm(Algorithm.HS384);
            } else if (algorithm.trim().equalsIgnoreCase("HS512")) {
                options.setAlgorithm(Algorithm.HS512);
            } else if (algorithm.trim().equalsIgnoreCase("RS256")) {
                options.setAlgorithm(Algorithm.RS256);
            } else if (algorithm.trim().equalsIgnoreCase("RS384")) {
                options.setAlgorithm(Algorithm.RS384);
            } else if (algorithm.trim().equalsIgnoreCase("RS512")) {
                options.setAlgorithm(Algorithm.RS512);
            } else {
                options = null;
            }
        }

        if (options == null) {
            LOGGER.debug("options null ");

        } else {
            LOGGER.debug("options : " + options.getAlgorithm().name());
        }

        final String jwt = options == null ? signer.sign(claims) : signer.sign(claims, options);

        LOGGER.info("generated token : \n" + jwt);

        return jwt;
    }

    public Map<String, Object> verifyToken(String token) throws Exception {
        LOGGER.info("verifying token : \n" + token);
        LOGGER.debug("secret : " + secret);
        LOGGER.debug("algorithm : " + algorithm);

        try {
            final JWTVerifier verifier = new JWTVerifier(DatatypeConverter.parseBase64Binary(secret));
            final Map<String, Object> claims = verifier.verify(token);

            try {
                for (Object entry : claims.entrySet()) {
                    LOGGER.debug("entry : " + entry.toString());
                    try {
                        LOGGER.debug("entry class : " + entry.getClass());

                    } catch (Exception e) {
                        LOGGER.error("error get entry..." + e.toString());
                    }
                }
            } catch (Exception e) {
                LOGGER.error("error printing result map..." + e.toString());
            }

            return claims;

        } catch (JWTVerifyException e) {
            LOGGER.error("JWTVerifyException : " + e.toString());
            throw e;
        } catch (InvalidKeyException e) {
            LOGGER.error("InvalidKeyException : " + e.toString());
            throw e;
        } catch (NoSuchAlgorithmException e) {
            LOGGER.error("NoSuchAlgorithmException : " + e.toString());
            throw e;
        } catch (IllegalStateException e) {
            LOGGER.error("IllegalStateException : " + e.toString());
            throw e;
        } catch (SignatureException e) {
            LOGGER.error("SignatureException : " + e.toString());
            throw e;
        } catch (IOException e) {
            LOGGER.error("IOException : " + e.toString());
            throw e;
        }
    }

    public Map<String, Object> verifyAudAndIss(String token, String iss, String aud) throws Exception {
        LOGGER.info("verifying Aud & Iss : \n" + token);
        try {
            final JWTVerifier verifier = new JWTVerifier(secret, aud, iss);
            final Map<String, Object> claims = verifier.verify(token);

            try {
                for (Object entry : claims.entrySet()) {
                    LOGGER.debug("entry : " + entry.toString());
                    try {
                        LOGGER.debug("entry class : " + entry.getClass());

                    } catch (Exception e) {
                        LOGGER.error("error get entry..." + e.toString());
                    }
                }
            } catch (Exception e) {
                LOGGER.error("error printing result map..." + e.toString());
            }

            return claims;
        } catch (JWTVerifyException e) {
            LOGGER.error("JWTVerifyException : " + e.toString());
            throw e;
        } catch (InvalidKeyException e) {
            LOGGER.error("InvalidKeyException : " + e.toString());
            throw e;
        } catch (NoSuchAlgorithmException e) {
            LOGGER.error("NoSuchAlgorithmException : " + e.toString());
            throw e;
        } catch (IllegalStateException e) {
            LOGGER.error("IllegalStateException : " + e.toString());
            throw e;
        } catch (SignatureException e) {
            LOGGER.error("SignatureException : " + e.toString());
            throw e;
        } catch (IOException e) {
            LOGGER.error("IOException : " + e.toString());
            throw e;
        }
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Long getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Long issuedAt) {
        this.issuedAt = issuedAt;
    }

    public Long getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(Long expiredAt) {
        this.expiredAt = expiredAt;
    }

    public String getJwtid() {
        return jwtid;
    }

    public void setJwtid(String jwtid) {
        this.jwtid = jwtid;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public void setKey(PrivateKey key) {
        this.key = key;
    }

}
