package com.learn.rest.webservices.restful_web_services.user;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class UserResource {

    UserDaoService userDaoService;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userDaoService.findAll();

    }

    @GetMapping("/users/{id}")
    public User retrieveUsers(@PathVariable int id) {
        User user = userDaoService.findByIds(id);
        if(user==null){
            throw new UserNotFoundException("Not found");
        }
        return user;
    }


    //POST

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User savedUser = userDaoService.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri(); //users/{id}
        return ResponseEntity.created(location).build();

    }

    @DeleteMapping("/users/{id}")
    public void deleteUsers(@PathVariable int id) {
        userDaoService.deleteByUserId(id);
    }


}
