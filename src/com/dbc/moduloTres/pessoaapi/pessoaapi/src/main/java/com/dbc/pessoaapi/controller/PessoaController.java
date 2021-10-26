package com.dbc.pessoaapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    @GetMapping
    public String hello(){
        return "Hello World";
    }

}
