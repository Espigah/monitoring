package br.com.espigah.greeting;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("greeting")
public class GreetingController {

    final static Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @Autowired
    GreetingService greetingService;

    @GetMapping("{name}")
    public String greeting(@PathVariable String name) {
        return greetingService.message(name);
    }
}