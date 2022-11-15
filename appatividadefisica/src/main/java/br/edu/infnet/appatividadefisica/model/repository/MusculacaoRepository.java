package br.edu.infnet.appatividadefisica.model.repository;

import br.edu.infnet.appatividadefisica.model.domain.Musculacao;
import br.edu.infnet.appatividadefisica.model.domain.Natacao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MusculacaoRepository extends CrudRepository<Musculacao, Integer> {

    @Query("from Musculacao s where s.usuario.id = :userid")
    List<Musculacao> obterLista(Integer userid);
}