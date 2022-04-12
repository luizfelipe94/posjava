package br.edu.infnet.posjava;

import br.edu.infnet.posjava.ingresso.model.domain.Futebol;
import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.service.FutebolService;
import br.edu.infnet.posjava.ingresso.model.service.UsuarioService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class FutebolLoader implements ApplicationRunner {

    private FutebolService futebolService;

    FutebolLoader(FutebolService futebolService) {
        this.futebolService = futebolService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setId(1);
        Futebol futebol = new Futebol();
        futebol.setTitulo("flamengo x vasco");
        futebol.setValor(60);
        futebol.setEstadio("maracana");
        futebol.setTime1("flamengo");
        futebol.setTime2("vasco");
        futebol.setUsuario(usuario);
        this.futebolService.incluir(futebol);
    }
}
