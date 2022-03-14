package br.edu.infnet.posjava.ingresso.model.test;

import br.edu.infnet.posjava.ingresso.model.domain.Ingresso;
import br.edu.infnet.posjava.ingresso.model.domain.Torcedor;

public class IngressoTest {

    public static void main(String[] args) {

        Torcedor torcedor = new Torcedor();

        Ingresso ingresso = new Ingresso();
        ingresso.setDescricao("Primeiro ingresso");
        ingresso.setPagamentoOnline(true);
        ingresso.setTorcedor(torcedor);
        ingresso.setJogos(null);

        System.out.println(ingresso);
    }

}
