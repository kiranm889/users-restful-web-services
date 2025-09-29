package com.learn.rest.webservices.restful_web_services.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user_details")
public class User {

    @Id
    @GeneratedValue
    private int id;
    @Size(min=2, message = "Name should have atleast 2 char")
    private String name;
    @Past(message = "Birth date should be in past")
    private LocalDate birthdate;
}
