package com.eter.gtw.rest.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eter.gtw.model.json.Article;
import com.eter.gtw.utils.URLConstants;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ifm.domain.master.M_Article;

@RestController
public class ArticleController extends BaseController {
    private static final Logger LOGGER = Logger.getLogger(ArticleController.class);

    @SuppressWarnings("unchecked")
    @RequestMapping(value = URLConstants.URL_ARTICLE_GET_ALL, method = RequestMethod.GET)
    public String getAllArticle() {
        try {
            LOGGER.debug("getAll Article...");

            List<M_Article> articles = pm.getAll(M_Article.class);

            String jsonInString = "";

            if (articles != null && articles.size() > 0) {
                LOGGER.debug("articles : " + articles.size());

                ObjectMapper mapper = new ObjectMapper();
                jsonInString = mapper.writeValueAsString(Article.fromM_Article(articles));
            } else {
                LOGGER.debug("no articles");
            }

            return jsonInString;
        } catch (Exception e) {
            LOGGER.error(e);
            return e.toString();
        }
    }
}
