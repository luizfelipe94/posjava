package br.edu.infnet.posjava;

import br.edu.infnet.posjava.ingresso.model.domain.Torcedor;
import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.service.TorcedorService;
import br.edu.infnet.posjava.ingresso.model.service.UsuarioService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class TorcedorLoader implements ApplicationRunner {

    private UsuarioService usuarioService;
    private TorcedorService torcedorService;

    TorcedorLoader(UsuarioService usuarioService, TorcedorService torcedorService) {
        this.usuarioService = usuarioService;
        this.torcedorService = torcedorService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Usuario usuario = new Usuario();
//        usuario.setId(1);
//
//        Torcedor torcedor = new Torcedor();
//        torcedor.setCpf("123123");
//        torcedor.setEmail("torcedor@torcedor.com");
//        torcedor.setNome("Luiz Silva");
//        torcedor.setUsuario(usuario);
//
//        this.torcedorService.incluir(torcedor);
    }
}
