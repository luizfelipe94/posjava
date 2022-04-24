package br.edu.infnet.posjava;

import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.service.UsuarioService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner {

    private UsuarioService usuarioService;

    UsuarioLoader(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        try {
            Usuario usuario = new Usuario();
            usuario.setAdmin(true);
            usuario.setEmail("luiz.silva@al.infnet.edu.br");
            usuario.setNome("Luiz Silva");
            usuario.setSenha("123");
            this.usuarioService.incluir(usuario);
        }catch (Exception ignored) {

        }
    }
}
