package br.edu.infnet.posjava.ingresso.model.test;

import br.edu.infnet.posjava.ingresso.model.domain.Pedido;
import br.edu.infnet.posjava.ingresso.model.domain.Torcedor;

public class IngressoTest {

    public static void main(String[] args) {

        Torcedor torcedor = new Torcedor();

        Pedido pedido = new Pedido();
        pedido.setDescricao("Primeiro ingresso");
        pedido.setPagamentoOnline(true);
        pedido.setTorcedor(torcedor);
        pedido.setJogos(null);

        System.out.println(pedido);
    }

}
