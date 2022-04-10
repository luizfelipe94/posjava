package br.edu.infnet.posjava.controller;

import br.edu.infnet.posjava.ingresso.model.domain.Basquete;
import br.edu.infnet.posjava.ingresso.model.service.BasqueteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String lista(Model model) {

        model.addAttribute("listagem", this.basqueteService.obterLista());

        return "/basquete/lista";
    }

    @PostMapping(value = "/incluir")
    public String incluir(Model model, Basquete basquete) {
        this.basqueteService.incluir(basquete);
        return "redirect:/basquete/listar";
    }

    @GetMapping(value = "/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        this.basqueteService.excluir(id);
        return "redirect:/basquete/listar";
    }

}
