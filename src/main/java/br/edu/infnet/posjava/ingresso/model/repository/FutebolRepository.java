package br.edu.infnet.posjava.ingresso.model.repository;

import br.edu.infnet.posjava.ingresso.model.domain.Futebol;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FutebolRepository extends CrudRepository<Futebol, Integer> {

    @Query("from Futebol f where f.usuario.id = :userId")
    List<Futebol> findAll(Integer userId, Sort by);

}
