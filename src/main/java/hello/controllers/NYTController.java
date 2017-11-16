package hello.controllers;

import hello.model.nyt.ArticleSearchResponse;
import hello.services.NYTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ryandesmond on 11/2/17.
 */
@RestController
@RequestMapping("/nyt")
public class NYTController {

    @Autowired
    NYTService service;

    /*
    NYT requires their dates in the following format: "yyyy-MM-dd"
     */
    @RequestMapping("/article/search")
    public ArticleSearchResponse searchArticles(@RequestParam("q") String query) {
        return service.articleSearch(query, "2017-01-01", "2017-11-03");
    }

}
