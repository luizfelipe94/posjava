package br.edu.infnet.posjava.ingresso.model.service;

import br.edu.infnet.posjava.ingresso.model.domain.Pedido;
import br.edu.infnet.posjava.ingresso.model.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PedidoService {

    PedidoRepository pedidoRepository;

    PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Collection<Pedido> obterLista(){
        return (Collection<Pedido>) this.pedidoRepository.findAll();
    }

    public void incluir(Pedido pedido) {
        this.pedidoRepository.save(pedido);
    }

    public void exluir(Integer id) {
        this.pedidoRepository.deleteById(id);
    }

}
