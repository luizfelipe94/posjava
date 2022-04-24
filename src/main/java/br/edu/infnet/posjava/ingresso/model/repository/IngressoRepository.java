package br.edu.infnet.posjava.ingresso.model.repository;

import br.edu.infnet.posjava.ingresso.model.domain.Ingresso;
import br.edu.infnet.posjava.ingresso.model.domain.Volei;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface IngressoRepository extends CrudRepository<Ingresso, Integer> {

    @Query("from Ingresso i where i.usuario.id = :id")
    Collection<Ingresso> findAll(Integer id, Sort by);

}
