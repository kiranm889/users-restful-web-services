package com.learn.rest.webservices.restful_web_services.user;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;
    @Size(min=2)
    private String name;
    @Past
    private LocalDate birthdate;
}
