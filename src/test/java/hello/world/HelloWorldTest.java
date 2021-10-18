package hello.world;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

@MicronautTest
class HelloWorldTest {

    @Inject
    EmbeddedApplication<?> application;

    @Inject
    GreetingService service;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }

    @Test
    void testService() {
        service.obtainGreetings();
        service.obtainGreetings();
    }

}
