package br.com.espigah

import io.micronaut.context.ApplicationContext
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.annotation.MicronautTest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import spock.lang.AutoCleanup
import spock.lang.Specification
import spock.lang.Shared
import spock.lang.Unroll

import javax.inject.Inject

@MicronautTest
class GreetingControllerSpec extends Specification {

    @Shared @Inject
    EmbeddedServer embeddedServer

    @Shared @AutoCleanup
    RxHttpClient client

    void setup() {
        client = embeddedServer.applicationContext.createBean(RxHttpClient, embeddedServer.getURL())
    }

    void "test greeting status"() {
        given:
        HttpResponse response = client.toBlocking().exchange("/greeting/test")

        expect:
        response.status == HttpStatus.OK
    }



    void "test greeting http response"() {
        given:
        def value = "test"
        String result = client.toBlocking().retrieve(HttpRequest.GET("/greeting/" + value), String)

        expect:
        result == "Micronaut, " + value
    }


}
