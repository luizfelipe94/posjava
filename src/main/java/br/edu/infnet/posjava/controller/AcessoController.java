package br.edu.infnet.posjava.controller;

import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AcessoController {

    private UsuarioService usuarioService;

    AcessoController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping(value = "/")
    public String telaIndex(){
        return "login";
    }

    @GetMapping(value = "/login")
    public String telaLogin(){
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(Model model, @RequestParam String email, @RequestParam String senha){

        Usuario usuario = this.usuarioService.validar(email, senha);

        if(usuario != null) {
            model.addAttribute("usuarioLogado", usuario);
            return "index";
        }

        String msg = email += ", você digitou informações inválidas!";

        model.addAttribute("mensagem", msg);

        return "login";

    }

}
