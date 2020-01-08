package br.com.espigah;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

@Controller("/greeting")
public class GreetingController {

    final static Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @Inject
    GreetingService greetingService;

    @Get("/{name}")
    public Single<String> greeting(String name) {
        return greetingService.message(name);
    }
}