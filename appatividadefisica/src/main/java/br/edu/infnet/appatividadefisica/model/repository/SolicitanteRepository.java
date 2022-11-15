package br.edu.infnet.appatividadefisica.model.repository;

import br.edu.infnet.appatividadefisica.model.domain.Solicitante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SolicitanteRepository extends CrudRepository<Solicitante, Integer> {

    @Query("from Solicitante s where s.usuario.id = :userid")
    List<Solicitante> obterLista(Integer userid);
}