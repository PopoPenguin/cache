package hello.services;

import hello.model.greeting.Greeting;
import org.springframework.stereotype.Service;

/**
 * Created by ryandesmond on 11/2/17.
 */
@Service
public class GreetingService {

    public Greeting getGreeting(String name){
        return new Greeting(name);
    }

}
