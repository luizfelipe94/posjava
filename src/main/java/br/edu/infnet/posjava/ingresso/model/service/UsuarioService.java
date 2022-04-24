package br.edu.infnet.posjava.ingresso.model.service;

import br.edu.infnet.posjava.ingresso.model.domain.Torcedor;
import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.repository.UsuarioRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario validar(String email, String senha) {
        return this.usuarioRepository.autenticacao(email, senha);
    }

    public void incluir(Usuario usuario) {
        this.usuarioRepository.save(usuario);
    }

    public Collection<Usuario> obterLista(){
        return (Collection<Usuario>) this.usuarioRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
    }

    public void exluir(Integer id) {
        this.usuarioRepository.deleteById(id);
    }

}
