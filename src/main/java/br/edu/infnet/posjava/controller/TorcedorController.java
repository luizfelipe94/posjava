package br.edu.infnet.posjava.controller;

import br.edu.infnet.posjava.ingresso.model.domain.Futebol;
import br.edu.infnet.posjava.ingresso.model.domain.Torcedor;
import br.edu.infnet.posjava.ingresso.model.service.FutebolService;
import br.edu.infnet.posjava.ingresso.model.service.TorcedorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/torcedor")
public class TorcedorController {

    private TorcedorService torcedorService;

    TorcedorController(TorcedorService torcedorService){
        this.torcedorService = torcedorService;
    }

    @GetMapping(value = "/cadastro")
    public String cadastro() {
        return "/torcedor/cadastro";
    }

    @GetMapping(value = "/listar")
    public String lista(Model model) {

        model.addAttribute("listagem", this.torcedorService.obterLista());

        return "/torcedor/lista";
    }

    @PostMapping(value = "/incluir")
    public String incluir(Model model, Torcedor torcedor) {
        this.torcedorService.incluir(torcedor);
        return "redirect:/torcedor/listar";
    }

    @GetMapping(value = "/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        this.torcedorService.exluir(id);
        return "redirect:/torcedor/listar";
    }

}
