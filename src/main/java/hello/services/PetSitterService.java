package hello.services;

import hello.model.petsitter.Cat;
import hello.model.petsitter.Collar;
import hello.model.petsitter.Dog;
import hello.model.petsitter.PetSitter;
import org.springframework.stereotype.Service;

/**
 * Created by ryandesmond on 11/2/17.
 */
@Service
public class PetSitterService {

    public PetSitter getPetSitter() {
        PetSitter sitter = new PetSitter();

        sitter.setName("Wanda Walk The Dogs");
        sitter.setHourlyRatePerAnimal(15);

        for(int i = 0; i <= 6; i++){
            if (i % 2 == 0) {
                sitter.getCats().add(new Cat("Belle", "Brown and White"));
                sitter.getDogs().add(new Dog("German Shepherd", "Large", new Collar("8792b289hk2")));
            } else if (i % 3 == 0){
                sitter.getCats().add(new Cat("Happy", "Orange"));
                sitter.getDogs().add(new Dog("Corgy", "Small", new Collar("15bs83a03hd")));
            } else {
                sitter.getCats().add(new Cat("Orien", "Black"));
                sitter.getDogs().add(new Dog("Bull Mastiff", "Extra Large", new Collar("276ebs9ahd987")));
            }
        }
        return sitter;
    }
}
