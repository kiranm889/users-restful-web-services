package com.learn.rest.webservices.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    //Path-Param
    // /user/{id}/todos/{id}  => /user/2/todos/200  2,200 -> Path Parameters

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name ){
        return new HelloWorldBean("Hello World! -> "+ name);
    }
}
