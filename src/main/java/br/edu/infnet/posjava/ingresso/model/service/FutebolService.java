package br.edu.infnet.posjava.ingresso.model.service;

import br.edu.infnet.posjava.ingresso.model.domain.Futebol;
import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.repository.FutebolRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class FutebolService {

    FutebolRepository futebolRepository;

    FutebolService(FutebolRepository futebolRepository) {
        this.futebolRepository = futebolRepository;
    }

    public Collection<Futebol> obterLista(Usuario usuario){
        return (Collection<Futebol>) this.futebolRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "titulo"));
    }

    public void incluir(Futebol futebol) {
        this.futebolRepository.save(futebol);
    }

    public void excluir(Integer id) {
        this.futebolRepository.deleteById(id);
    }

}
