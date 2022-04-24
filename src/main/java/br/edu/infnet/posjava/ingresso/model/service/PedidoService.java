package br.edu.infnet.posjava.ingresso.model.service;

import br.edu.infnet.posjava.ingresso.model.domain.Pedido;
import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.repository.PedidoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PedidoService {

    PedidoRepository pedidoRepository;

    PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Collection<Pedido> obterLista(Usuario usuario){
        return (Collection<Pedido>) this.pedidoRepository.findAll(usuario.getId(), Sort.by(Sort.DEFAULT_DIRECTION, "data"));
    }

    public Collection<Pedido> obterLista(){
        return (Collection<Pedido>) this.pedidoRepository.findAll(Sort.by(Sort.DEFAULT_DIRECTION, "data"));
    }

    public void incluir(Pedido pedido) {
        this.pedidoRepository.save(pedido);
    }

    public void exluir(Integer id) {
        this.pedidoRepository.deleteById(id);
    }

    public Pedido obterPorId(Integer id) {
        return this.pedidoRepository.findById(id).orElse(null);
    }

}
