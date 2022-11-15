package br.edu.infnet.appatividadefisica.model.repository;

import br.edu.infnet.appatividadefisica.model.domain.Assinatura;
import br.edu.infnet.appatividadefisica.model.domain.Natacao;
import br.edu.infnet.appatividadefisica.model.domain.Solicitante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface NatacaoRepository extends CrudRepository<Natacao, Integer> {

    @Query("from Natacao s where s.usuario.id = :userid")
    List<Natacao> obterLista(Integer userid);

}