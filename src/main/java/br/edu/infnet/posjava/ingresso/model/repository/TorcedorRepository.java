package br.edu.infnet.posjava.ingresso.model.repository;

import br.edu.infnet.posjava.ingresso.model.domain.Torcedor;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TorcedorRepository extends CrudRepository<Torcedor, Integer> {

    @Query("from Torcedor t where t.usuario.id = :userId")
    List<Torcedor> findAll(Integer userId, Sort by);

}
