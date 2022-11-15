package br.edu.infnet.appatividadefisica.model.repository;

import br.edu.infnet.appatividadefisica.model.domain.Assinatura;
import br.edu.infnet.appatividadefisica.model.domain.Solicitante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AssinaturaRepository extends CrudRepository<Assinatura, Integer> {

    @Query("from Assinatura a where a.usuario.id =:userid")
    List<Assinatura> obterLista(Integer userid);
}