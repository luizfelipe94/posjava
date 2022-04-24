package br.edu.infnet.posjava.controller;

import br.edu.infnet.posjava.ingresso.model.domain.Torcedor;
import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController (UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping()
    public String cadastro() {
        return "/usuario/cadastro";
    }

    @GetMapping(value = "/listar")
    public String lista(Model model) {
        model.addAttribute("listagem", this.usuarioService.obterLista());
        return "/usuario/lista";
    }

    @PostMapping(value = "/incluir")
    public String incluir(Model model, Usuario usuario) {
        this.usuarioService.incluir(usuario);
        return "redirect:/";
    }

    @GetMapping(value = "/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        this.usuarioService.exluir(id);
        return "redirect:/usuario/listar";
    }

}
