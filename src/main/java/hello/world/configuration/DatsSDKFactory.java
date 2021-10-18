package hello.world.configuration;

import hello.world.GreetingService;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Singleton;

@Factory
class DatsSDKFactory {

    @Singleton
    GreetingService greetingService() {
        return new GreetingService();
    }
}

