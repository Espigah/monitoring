package br.com.espigah;

import io.reactivex.Single;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;

@Singleton
public class GreetingService {

    final static Logger logger = LoggerFactory.getLogger(GreetingService.class);

    public Single<String> message(String name) {
        logger.info("Micronaut, " + name);
        return Single.just("Micronaut, " + name);
    }
}