package hello.controllers;

/*
created by PopoPenguin on 11/16/17
*/


import hello.model.quote.Quote;
import hello.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @Autowired
    QuoteService quoteService;

    @RequestMapping("/quote")
    public Quote getQuote(@RequestParam(value="id", required = false, defaultValue="0") long id) {
        if (id > 0) {
            return quoteService.requestQuote(id);
        } else {
            return quoteService.requestRandomQuote();
        }
    }
}
