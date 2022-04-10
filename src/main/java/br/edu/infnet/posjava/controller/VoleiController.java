package br.edu.infnet.posjava.controller;

import br.edu.infnet.posjava.ingresso.model.domain.Volei;
import br.edu.infnet.posjava.ingresso.model.service.VoleiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/volei")
public class VoleiController {

    private VoleiService voleiService;

    VoleiController(VoleiService voleiService) {
        this.voleiService = voleiService;
    }

    @GetMapping(value = "/cadastro")
    public String cadastro() {
        return "/volei/cadastro";
    }

    @GetMapping(value = "/listar")
    public String lista(Model model) {

        model.addAttribute("listagem", this.voleiService.obterLista());

        return "/volei/lista";
    }

    @PostMapping(value = "/incluir")
    public String incluir(Model model, Volei volei) {
        this.voleiService.incluir(volei);
        return "redirect:/volei/listar";
    }

    @GetMapping(value = "/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        this.voleiService.excluir(id);
        return "redirect:/volei/listar";
    }

}
