package br.edu.infnet.posjava.controller;

import br.edu.infnet.posjava.ingresso.model.domain.Basquete;
import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.service.BasqueteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller()
@RequestMapping("/basquete")
public class BasqueteController {

    private BasqueteService basqueteService;

    public BasqueteController(BasqueteService basqueteService) {
        this.basqueteService = basqueteService;
    }

    @GetMapping(value = "/cadastro")
    public String cadastro() {
        return "/basquete/cadastro";
    }

    @GetMapping(value = "/listar")
    public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
        model.addAttribute("listagem", this.basqueteService.obterLista(usuario));
        return "/basquete/lista";
    }

    @PostMapping(value = "/incluir")
    public String incluir(Model model, Basquete basquete, @SessionAttribute("usuarioLogado") Usuario usuario) {
        basquete.setUsuario(usuario);
        this.basqueteService.incluir(basquete);
        return "redirect:/basquete/listar";
    }

    @GetMapping(value = "/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        this.basqueteService.excluir(id);
        return "redirect:/basquete/listar";
    }

}
