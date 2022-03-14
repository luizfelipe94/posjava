package br.edu.infnet.posjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/torcedor")
public class TorcedorController {

    @GetMapping()
    public String listar() {
        return "/torcedor/cadastro";
    }

    @PostMapping(value = "/incluir")
    public String incluir() {
        return "index";
    }

}
