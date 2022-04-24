package br.edu.infnet.posjava.controller;

import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.domain.Volei;
import br.edu.infnet.posjava.ingresso.model.service.IngressoService;
import br.edu.infnet.posjava.ingresso.model.service.VoleiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ingresso")
public class IngressoController {

    private IngressoService ingressoService;

    IngressoController(IngressoService ingressoService) {
        this.ingressoService = ingressoService;
    }

    @GetMapping(value = "/listar")
    public String lista(Model model, @SessionAttribute("usuarioLogado")Usuario usuario) {
        model.addAttribute("listagem", this.ingressoService.obterLista(usuario));
        return "/ingresso/lista";
    }

    @GetMapping(value = "/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        this.ingressoService.excluir(id);
        return "redirect:/volei/listar";
    }

}
