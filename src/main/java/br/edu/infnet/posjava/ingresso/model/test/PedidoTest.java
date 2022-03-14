package br.edu.infnet.posjava.ingresso.model.test;

import br.edu.infnet.posjava.ingresso.model.domain.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidoTest {

    public static void main(String[] args) {

        Futebol futebol = new Futebol("Flamengo x Vasco", 80, LocalDateTime.of(2022, 3, 14, 16, 0, 0), "flamengo", "vasco", "Maracana");
        Volei volei = new Volei("Brasil x Italia", 100, LocalDateTime.of(2022, 3, 14, 16, 0, 0), "Brasil", "Italia", "Maracanazinho");
        Basquete basquete = new Basquete("Lakers X Raptors", 120, LocalDateTime.of(2022, 3, 14, 16, 0, 0), "Lakers", "Raptors", "Crypto.com Arena");

        List<Ingresso> ingressos = new ArrayList<Ingresso>();
        ingressos.add(futebol);
        ingressos.add(volei);
        ingressos.add(basquete);

        Torcedor torcedor = new Torcedor();

        Pedido pedido = new Pedido();
        pedido.setDescricao("Primeiro ingresso");
        pedido.setPagamentoOnline(true);
        pedido.setTorcedor(torcedor);
        pedido.setJogos(ingressos);

        System.out.println(pedido);
    }

}
