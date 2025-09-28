package com.learn.rest.webservices.restful_web_services.helloworld;

import lombok.Data;
import lombok.NoArgsConstructor;


public class HelloWorldBean {

    private String message;
    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
