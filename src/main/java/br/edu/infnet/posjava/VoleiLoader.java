package br.edu.infnet.posjava;

import br.edu.infnet.posjava.ingresso.model.domain.Basquete;
import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.domain.Volei;
import br.edu.infnet.posjava.ingresso.model.service.BasqueteService;
import br.edu.infnet.posjava.ingresso.model.service.VoleiService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class VoleiLoader implements ApplicationRunner {

    private VoleiService voleiService;

    VoleiLoader(VoleiService voleiService) {
        this.voleiService = voleiService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Usuario usuario = new Usuario();
//        usuario.setId(1);
//        Volei volei = new Volei();
//        volei.setTitulo("flamengo x vasco");
//        volei.setValor(60);
//        volei.setQuadra("rua2");
//        volei.setTime1("flamengo");
//        volei.setTime2("vasco");
//        volei.setUsuario(usuario);
//        this.voleiService.incluir(volei);
    }
}
