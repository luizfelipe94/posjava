package br.edu.infnet.posjava.ingresso.model.service;

import br.edu.infnet.posjava.ingresso.model.domain.Volei;
import br.edu.infnet.posjava.ingresso.model.repository.VoleiRepository;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class VoleiService {

    VoleiRepository voleiRepository;

    VoleiService(VoleiRepository voleiRepository) {
        this.voleiRepository = voleiRepository;
    }

    public Collection<Volei> obterLista(){
        return (Collection<Volei>) this.voleiRepository.findAll();
    }

    public void incluir(Volei volei) {
        this.voleiRepository.save(volei);
    }

    public void excluir(Integer id) {
        this.voleiRepository.deleteById(id);
    }

}
