package br.edu.infnet.posjava.ingresso.model.repository;

import br.edu.infnet.posjava.ingresso.model.domain.Basquete;
import br.edu.infnet.posjava.ingresso.model.domain.Futebol;
import br.edu.infnet.posjava.ingresso.model.domain.Volei;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasqueteRepository extends CrudRepository<Basquete, Integer> {

    @Query("from Basquete f where f.usuario.id = :userId")
    List<Basquete> findAll(Integer userId, Sort by);

}
