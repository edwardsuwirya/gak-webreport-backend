package com.eter.gtw.rest.controller;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eter.gtw.model.json.CommonResponse;
import com.eter.gtw.model.json.CreateToken;
import com.eter.gtw.model.json.Token;
import com.eter.gtw.security.JwtUtil;
import com.eter.gtw.utils.URLConstants;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ifm.domain.master.M_Country;

@RestController
public class CommonController extends BaseController {
    @Autowired
    ControllerProperties controllerProperties;

    private static final Logger LOGGER = Logger.getLogger(CommonController.class);

    @RequestMapping(value = URLConstants.URL_TEST, method = RequestMethod.GET)
    public String hello(@PathVariable String message) {
        LOGGER.debug("message===>" + message);
        return "hello " + message;
    }

    @RequestMapping(value = URLConstants.URL_COUNTRY_GET_ALL, method = RequestMethod.GET)
    public CommonResponse getAllCountry() {
        String sql = "FROM M_Country m";
        List<M_Country> countries;
        try {
            countries = pm.getList(sql);
            ObjectMapper mapper = new ObjectMapper();
            String jsonInString = mapper.writeValueAsString(countries);
            return new CommonResponse("0", jsonInString);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            LOGGER.error(e);
            return new CommonResponse("99", e.toString());
        }
    }

    @RequestMapping(value = URLConstants.URL_COUNTRY_ADD, method = RequestMethod.POST)
    public CommonResponse addCountry(@RequestBody M_Country country) {
        M_Country c = new M_Country();
        c.setS_countryCode(country.getS_countryCode());
        c.setS_countryName(country.getS_countryName());

        c.setS_countryActive("A");
        c.setS_countryAreaCode(country.getS_countryAreaCode());
        c.setI_countryCreateID(1);
        c.setD_countryCreateDate(Calendar.getInstance().getTime());
        c.setI_countryUpdateID(1);
        c.setD_countryUpdateDate(Calendar.getInstance().getTime());

        try {
            country = (M_Country) pm.Save(c);
            return new CommonResponse("0", country.getS_countryCode());
        } catch (Exception e) {
            LOGGER.error(e);
            return new CommonResponse("99", e.toString());
        }

    }

    @RequestMapping(value = URLConstants.URL_CREATE_TOKEN, method = RequestMethod.POST, produces = "application/json")
    public Token createToken(@RequestBody CreateToken createToken) {
        try {
            LOGGER.debug("userId : " + createToken.getUserId());
            LOGGER.debug("passwd : " + createToken.getPassword());
            LOGGER.debug("clientAddress : " + createToken.getClientAddress());

            if (createToken.getUserId().equals("5asec") && createToken.getPassword().equals("secret")) {
                Map<String, String> params = new HashMap<String, String>();
                params.put("name", createToken.getUserId());
                params.put("client", createToken.getClientAddress());

                JwtUtil jwtUtil = new JwtUtil("5aSec", "http://www.5aSec.com");
                jwtUtil.setIssuedAt(System.currentTimeMillis() / 1000);
                jwtUtil.setExpiredAt((jwtUtil.getIssuedAt()) + Long.valueOf(controllerProperties.getTokenExpired()));
                jwtUtil.setJwtid(UUID.randomUUID().toString());
                jwtUtil.setSubject(createToken.getUserId());
                jwtUtil.setParams(params);

                try {
                    Token token = new Token();
                    token.setToken(jwtUtil.generateToken());
                    token.setFullName("Edo");
                    return token;
                } catch (Exception e) {
                    LOGGER.error("error creating token : " + e.toString());
                    return new Token();
                }
            } else {
                return new Token();
            }
        } catch (Exception e) {
            LOGGER.error(e.toString());
            return new Token();
        }
    }

    public void setControllerProperties(ControllerProperties controllerProperties) {
        this.controllerProperties = controllerProperties;
    }

}
