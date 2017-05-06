package com.eter.gtw.rest.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eter.gtw.model.json.ResponsibilityCenter;
import com.eter.gtw.utils.URLConstants;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ifm.domain.master.M_ResponsibilityCenter;

@RestController
public class ResponsibilityCenterController extends BaseController {
    private static final Logger LOGGER = Logger.getLogger(ResponsibilityCenterController.class);

    @SuppressWarnings("unchecked")
    @RequestMapping(value = URLConstants.URL_RESPONSIBILITY_CENTER_GET_ALL, method = RequestMethod.GET)
    public String getAllResponsibilityCenter() {
        try {
            LOGGER.debug("getAll ResponsibilityCenter...");

            List<M_ResponsibilityCenter> responsibilityCenters = pm.getAll(M_ResponsibilityCenter.class);

            String jsonInString = "";

            if (responsibilityCenters != null && responsibilityCenters.size() > 0) {
                LOGGER.debug("responsibilityCenters : " + responsibilityCenters.size());

                ObjectMapper mapper = new ObjectMapper();
                jsonInString = mapper.writeValueAsString(ResponsibilityCenter.fromM_ResponsibilityCenter(responsibilityCenters));
            } else {
                LOGGER.debug("no responsibilityCenters");
            }

            return jsonInString;
        } catch (Exception e) {
            LOGGER.error(e);
            return e.toString();
        }
    }
}
