package com.learn.rest.webservices.restful_web_services.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
    //timeStamp
    private LocalDate timestamp;
    //msg
    private String message;
    //details
    private String details;



}
