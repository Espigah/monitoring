package br.com.espigah.greeting;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class GreetingService {

    final static Logger logger = LoggerFactory.getLogger(GreetingService.class);

    public String message(String name) {
        logger.info("Spring, " + name);
        return "Spring, " + name;
    }
}