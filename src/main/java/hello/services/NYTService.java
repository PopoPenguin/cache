package hello.services;

import hello.model.nyt.ArticleSearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

/**
 * Created by ryandesmond on 11/2/17.
 */
@Service
public class NYTService {

    @Autowired
    RestTemplate restTemplate;

    public ArticleSearchResponse articleSearch(String query, String start, String end) {


        ArrayList<String> list = new ArrayList();

        return restTemplate.getForObject(
                "https://api.nytimes.com/svc/search/v2/articlesearch.json" +
                        "?query=" + query + "&opening-date=" + start + ";" + end +
                        "&apikey=e87bbc8db5be47ac9e46bc5838455765", ArticleSearchResponse.class);

    }
}
