package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;

/**
 * Property injection least preferred method of DI
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return getGreetingService().sayGreeting();
    }

    public GreetingServiceImpl getGreetingService() {
        return greetingService;
    }

}
