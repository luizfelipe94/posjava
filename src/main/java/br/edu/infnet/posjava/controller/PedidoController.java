package br.edu.infnet.posjava.controller;

import br.edu.infnet.posjava.ingresso.model.domain.Ingresso;
import br.edu.infnet.posjava.ingresso.model.domain.Pedido;
import br.edu.infnet.posjava.ingresso.model.domain.Torcedor;
import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.service.IngressoService;
import br.edu.infnet.posjava.ingresso.model.service.PedidoService;
import br.edu.infnet.posjava.ingresso.model.service.TorcedorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    private PedidoService pedidoService;
    private IngressoService ingressoService;
    private TorcedorService torcedorService;

    public PedidoController(PedidoService pedidoService, IngressoService ingressoService, TorcedorService torcedorService) {
        this.pedidoService = pedidoService;
        this.ingressoService = ingressoService;
        this.torcedorService = torcedorService;
    }

    @GetMapping()
    public String cadastro(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
        List<Ingresso> ingressos = (List<Ingresso>) this.ingressoService.obterLista(usuario);
        List<Torcedor> torcedores = (List<Torcedor>) this.torcedorService.obterLista(usuario);
        model.addAttribute("ingressos", ingressos);
        model.addAttribute("torcedores", torcedores);
        return "pedido/cadastro";
    }

    @GetMapping(value = "/listar")
    public String listar(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
        model.addAttribute("listagem", this.pedidoService.obterLista(usuario));
        return "pedido/lista";
    }

    @PostMapping(value = "/incluir")
    public String incluir(Model model, Pedido pedido, @RequestParam String[] idsIngressos, @SessionAttribute("usuarioLogado") Usuario usuario) {
        pedido.setUsuario(usuario);
        List<Ingresso> ingressos = new ArrayList<>();
        for (String id : idsIngressos){
            Ingresso ingresso = this.ingressoService.obterPorId(Integer.valueOf(id));
            ingressos.add(ingresso);
        }
        pedido.setIngressos(ingressos);
        this.pedidoService.incluir(pedido);
        return "redirect:/pedido/listar";
    }

    @GetMapping(value = "/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        this.pedidoService.exluir(id);
        return "redirect:/pedido/listar";
    }

}
