package br.edu.infnet.posjava.ingresso.model.test;

import br.edu.infnet.posjava.ingresso.model.domain.Basquete;
import br.edu.infnet.posjava.ingresso.model.domain.Futebol;
import br.edu.infnet.posjava.ingresso.model.domain.Volei;

import java.time.LocalDateTime;

public class JogoTest {

    public static void main(String[] args) {
        Futebol futebol = new Futebol("Flamengo x Vasco", 80, LocalDateTime.of(2022, 3, 14, 16, 0, 0), "flamengo", "vasco", "Maracana");
        Volei volei = new Volei("Brasil x Italia", 100, LocalDateTime.of(2022, 3, 14, 16, 0, 0), "Brasil", "Italia", "Maracanazinho");
        Basquete basquete = new Basquete("Lakers X Raptors", 120, LocalDateTime.of(2022, 3, 14, 16, 0, 0), "Lakers", "Raptors", "Crypto.com Arena");
    }

}
