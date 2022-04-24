package br.edu.infnet.posjava;

import br.edu.infnet.posjava.ingresso.model.domain.Basquete;
import br.edu.infnet.posjava.ingresso.model.domain.Futebol;
import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.service.BasqueteService;
import br.edu.infnet.posjava.ingresso.model.service.FutebolService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class BasqueteLoader implements ApplicationRunner {

    private BasqueteService basqueteService;

    BasqueteLoader(BasqueteService basqueteService) {
        this.basqueteService = basqueteService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Usuario usuario = new Usuario();
//        usuario.setId(1);
//        Basquete basquete = new Basquete();
//        basquete.setTitulo("flamengo x vasco");
//        basquete.setValor(60);
//        basquete.setQuadra("rua2");
//        basquete.setTime1("flamengo");
//        basquete.setTime2("vasco");
//        basquete.setUsuario(usuario);
//        this.basqueteService.incluir(basquete);
    }
}
