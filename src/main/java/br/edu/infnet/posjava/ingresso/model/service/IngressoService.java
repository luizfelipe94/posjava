package br.edu.infnet.posjava.ingresso.model.service;

import br.edu.infnet.posjava.ingresso.model.domain.Ingresso;
import br.edu.infnet.posjava.ingresso.model.domain.Usuario;
import br.edu.infnet.posjava.ingresso.model.domain.Volei;
import br.edu.infnet.posjava.ingresso.model.repository.IngressoRepository;
import br.edu.infnet.posjava.ingresso.model.repository.VoleiRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class IngressoService {

    private IngressoRepository ingressoRepository;

    IngressoService(IngressoRepository ingressoRepository) {
        this.ingressoRepository = ingressoRepository;
    }

    public Collection<Ingresso> obterLista(Usuario usuario){
        return (Collection<Ingresso>) this.ingressoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "titulo"));
    }

    public void excluir(Integer id) {
        this.ingressoRepository.deleteById(id);
    }

    public Ingresso obterPorId(Integer id) {
        return this.ingressoRepository.findById(id).orElse(null);
    }

}
