package br.edu.infnet.posjava.ingresso.model.service;

import br.edu.infnet.posjava.ingresso.model.domain.Torcedor;
import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.repository.TorcedorRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TorcedorService {

    TorcedorRepository torcedorRepository;

    TorcedorService(TorcedorRepository torcedorRepository) {
        this.torcedorRepository = torcedorRepository;
    }

    public Collection<Torcedor> obterLista(Usuario usuario){
        return (Collection<Torcedor>) this.torcedorRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
    }

    public void incluir(Torcedor torcedor) {
        this.torcedorRepository.save(torcedor);
    }

    public void exluir(Integer id) {
        this.torcedorRepository.deleteById(id);
    }

}
