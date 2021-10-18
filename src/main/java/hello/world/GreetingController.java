package hello.world;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/greetings")
class GreetingController {

    @Inject
    GreetingService service;

    @Get(produces = MediaType.TEXT_PLAIN)
    List<String> greetings() {
        return service.obtainGreetings();
    }
}
