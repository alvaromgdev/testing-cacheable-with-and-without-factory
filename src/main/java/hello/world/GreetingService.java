package hello.world;

import io.micronaut.cache.annotation.Cacheable;

import java.util.ArrayList;
import java.util.List;

public class GreetingService {

    @Cacheable("greetings")
    List<String> obtainGreetings() {
        List<String> response = new ArrayList<>();
        response.add("hi");
        response.add("Hello");

        System.out.println("probando");

        return response;
    }

}
