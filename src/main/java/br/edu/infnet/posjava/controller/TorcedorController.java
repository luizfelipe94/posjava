package br.edu.infnet.posjava.controller;

import br.edu.infnet.posjava.ingresso.model.domain.Futebol;
import br.edu.infnet.posjava.ingresso.model.domain.Torcedor;
import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.service.FutebolService;
import br.edu.infnet.posjava.ingresso.model.service.TorcedorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
        model.addAttribute("listagem", this.torcedorService.obterLista(usuario));
        return "/torcedor/lista";
    }

    @PostMapping(value = "/incluir")
    public String incluir(Model model, Torcedor torcedor, @SessionAttribute("usuarioLogado") Usuario usuario) {
        torcedor.setUsuario(usuario);
        this.torcedorService.incluir(torcedor);
        return "redirect:/torcedor/listar";
    }

    @GetMapping(value = "/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        this.torcedorService.exluir(id);
        return "redirect:/torcedor/listar";
    }

}
