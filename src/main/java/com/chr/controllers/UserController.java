package com.chr.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/users/")
public class UserController {
    @GetMapping("")
    public String getUsers(){
        return "Usuarios";
    }
}
