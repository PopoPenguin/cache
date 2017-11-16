package hello.controllers;

import hello.model.petsitter.PetSitter;
import hello.services.PetSitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ryandesmond on 11/2/17.
 */
@RestController
@RequestMapping("/petsitter")
public class PetSitterController {

    @Autowired
    PetSitterService service;

    @RequestMapping("/")
    public PetSitter getDefault(){
        PetSitter p = new PetSitter();
        p.setName("N/A");
        return p;
    }

    @RequestMapping("/wanda")
    public PetSitter getPetSitter(){
        return service.getPetSitter();
    }

}
