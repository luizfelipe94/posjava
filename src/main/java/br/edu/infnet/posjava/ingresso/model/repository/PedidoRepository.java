package br.edu.infnet.posjava.ingresso.model.repository;

import br.edu.infnet.posjava.ingresso.model.domain.Basquete;
import br.edu.infnet.posjava.ingresso.model.domain.Ingresso;
import br.edu.infnet.posjava.ingresso.model.domain.Pedido;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

    @Query("from Pedido p where p.usuario.id = :id")
    Collection<Pedido> findAll(Integer id, Sort by);

    Collection<Pedido> findAll(Sort by);

}
