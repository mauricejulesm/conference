package com.mauricejm.conference.controller;

import com.mauricejm.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public void getRegistration(@ModelAttribute("registration")Registration registration){
        //return "registration";
    }

    @PostMapping("registration")
    public void addRegistration(@ModelAttribute("registration")Registration registration){
        System.out.println("Registered name: " +registration.getName());
        //return "registration";
    }
}
