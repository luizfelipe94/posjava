package br.edu.infnet.posjava.ingresso.model.service;

import br.edu.infnet.posjava.ingresso.model.domain.Basquete;
import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.repository.BasqueteRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class BasqueteService {

    private BasqueteRepository basqueteRepository;

    BasqueteService(BasqueteRepository basqueteRepository) {
        this.basqueteRepository = basqueteRepository;
    }

    public Collection<Basquete> obterLista(Usuario usuario){
        return (Collection<Basquete>) this.basqueteRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "titulo"));
    }

    public void incluir(Basquete basquete) {
        this.basqueteRepository.save(basquete);
    }

    public void excluir(Integer id) {
        this.basqueteRepository.deleteById(id);
    }

}
