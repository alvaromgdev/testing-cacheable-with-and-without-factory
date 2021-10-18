package hello.world;

import io.micronaut.cache.annotation.Cacheable;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
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
