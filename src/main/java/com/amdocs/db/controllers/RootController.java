package com.amdocs.db.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    
    @GetMapping("/")
    public String getRoot(){
        return "<h1>Bienvenido al curso</h1>";
    }
}
