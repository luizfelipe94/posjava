package br.edu.infnet.posjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FutebolController {

    @GetMapping(value = "/futebol")
    public String cadastro() {
        return "/futebol/cadastro";
    }

}
