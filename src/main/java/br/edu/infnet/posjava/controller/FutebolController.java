package br.edu.infnet.posjava.controller;

import br.edu.infnet.posjava.ingresso.model.domain.Futebol;
import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.service.FutebolService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
        model.addAttribute("listagem", this.futebolService.obterLista(usuario));
        return "/futebol/lista";
    }

    @PostMapping(value = "/incluir")
    public String incluir(Model model, Futebol futebol, @SessionAttribute("usuarioLogado") Usuario usuario) {
        futebol.setUsuario(usuario);
        this.futebolService.incluir(futebol);
        return "redirect:/futebol/listar";
    }

    @GetMapping(value = "/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        this.futebolService.excluir(id);
        return "redirect:/futebol/listar";
    }

}
