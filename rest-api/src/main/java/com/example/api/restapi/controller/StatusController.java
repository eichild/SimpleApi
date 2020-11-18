package com.example.api.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    //Verificando se a aplicação está online
    @GetMapping(path = "/api/status")
    public String check(){
        return "online";
    }
}
