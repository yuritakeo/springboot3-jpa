package com.example.course.resource;

import com.example.course.entitie.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "yuri" , "yuritakeo@gmail.com", "27988792730","123456");
        return ResponseEntity.ok().body(u);
    }

}