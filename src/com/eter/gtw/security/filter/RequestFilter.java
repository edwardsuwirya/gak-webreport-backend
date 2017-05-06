package com.eter.gtw.security.filter;

import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

import com.eter.gtw.security.JwtUtil;
import com.eter.gtw.utils.Constants;

public class RequestFilter implements Filter {
    private static final Logger logger = Logger.getLogger(RequestFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        // HttpSession session = req.getSession();

        String token = req.getHeader(Constants.AUTHENTICATION_HEADER);
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        String fromOptCors = httpRequest.getHeader("Access-Control-Request-Headers");
        if (!httpRequest.getMethod().equalsIgnoreCase("options") && fromOptCors == null) {
            if (StringUtils.isEmpty(token)) {
                logger.error("empty token");
                res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized request!");
            } else {
                try {
                    Map<String, Object> parseToken = new JwtUtil().verifyToken(token);
                    if (parseToken == null || parseToken.size() == 0) {
                        throw new Exception("Invalid token");
                    } else {
                        Integer expired = (Integer) parseToken.get("exp");
                        Long now = System.currentTimeMillis() / 1000L;
                        logger.debug("now : " + now);
                        logger.debug("exp : " + expired);
                        logger.debug("difference : " + (now - expired));

                        if (now > expired) {
                            res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Expired token!");
                        } else {
                            filterChain.doFilter(servletRequest, servletResponse);
                        }
                    }

                } catch (Exception e) {
                    logger.error(e.toString());
                    res.sendError(HttpServletResponse.SC_FORBIDDEN, "Forbidden request!");
                }
            }
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }
}