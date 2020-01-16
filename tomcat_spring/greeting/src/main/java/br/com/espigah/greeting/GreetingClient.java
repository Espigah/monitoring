package br.com.espigah.greeting;


import org.springframework.stereotype.Repository;

@Repository
public interface GreetingClient {
    String greeting(String name);
}