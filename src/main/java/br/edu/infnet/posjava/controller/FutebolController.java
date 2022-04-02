package br.edu.infnet.posjava.controller;

import br.edu.infnet.posjava.ingresso.model.domain.Futebol;
import br.edu.infnet.posjava.ingresso.model.service.FutebolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/futebol")
public class FutebolController {

    private FutebolService futebolService;

    FutebolController(FutebolService futebolService){
        this.futebolService = futebolService;
    }

    @GetMapping(value = "/cadastro")
    public String cadastro() {
        return "/futebol/cadastro";
    }

    @GetMapping(value = "/listar")
    public String lista(Model model) {

        model.addAttribute("listagem", this.futebolService.obterLista());

        return "/futebol/lista";
    }

    @PostMapping(value = "/incluir")
    public String incluir(Model model, Futebol futebol) {
        this.futebolService.incluir(futebol);
        return "redirect:/futebol/listar";
    }

    @GetMapping(value = "/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        this.futebolService.excluir(id);
        return "redirect:/futebol/listar";
    }

}
