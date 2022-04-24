package br.edu.infnet.posjava.ingresso.model.service;

import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.domain.Volei;
import br.edu.infnet.posjava.ingresso.model.repository.VoleiRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class VoleiService {

    VoleiRepository voleiRepository;

    VoleiService(VoleiRepository voleiRepository) {
        this.voleiRepository = voleiRepository;
    }

    public Collection<Volei> obterLista(Usuario usuario){
        return (Collection<Volei>) this.voleiRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "titulo"));
    }

    public void incluir(Volei volei) {
        this.voleiRepository.save(volei);
    }

    public void excluir(Integer id) {
        this.voleiRepository.deleteById(id);
    }

}
