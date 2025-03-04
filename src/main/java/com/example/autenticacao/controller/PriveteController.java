package com.example.autenticacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("privado")
public class PriveteController {
    @GetMapping
    public String getMenssage(){
        return "Um olá do autenticador";
    }
}
