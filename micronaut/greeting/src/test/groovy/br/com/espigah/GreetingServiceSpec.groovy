package br.com.espigah

import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.annotation.MicronautTest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.test.annotation.MockBean
import spock.lang.AutoCleanup
import spock.lang.Specification
import spock.lang.Shared

import javax.inject.Inject

@MicronautTest
class GreetingServiceSpec extends Specification {


    @Inject
    GreetingService greetingService


   // @Unroll
    void "test message"() {
        given:
        def message = greetingService.message("test");

        expect:
        message.test().assertResult("Micronaut, test")
    }


}
