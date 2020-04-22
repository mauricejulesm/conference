package com.mauricejm.conference.controller;

import com.mauricejm.conference.model.Registration;
import com.mauricejm.conference.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {
    @GetMapping("/user")
    public User getUser(@RequestParam(value="firstname", defaultValue = "Maurice" ) String firstname,
                          @RequestParam(value="lastname", defaultValue = "Mulisa" ) String lastname,
                          @RequestParam(value="age", defaultValue = "26" ) int age)
    {
        User user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);
        return user;
    }

    @PostMapping("/user")
    public User postUser(User user){
        System.out.println("Posted user firstname: "+ user.getFirstname());
        return user;
    }

}
