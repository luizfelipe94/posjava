package br.edu.infnet.posjava.controller;

import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@SessionAttributes("usuarioLogado")
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

    @GetMapping("/logout")
    public String logout(HttpSession session, SessionStatus status) {
        status.setComplete();
        session.removeAttribute("usuarioLogado");
        return "redirect:/";
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
