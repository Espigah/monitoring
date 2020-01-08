package br.com.espigah;


import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;



@Client("greeting")
public interface GreetingClient {

    @Get("/{name}")
    Single<String> greeting(String name);
}