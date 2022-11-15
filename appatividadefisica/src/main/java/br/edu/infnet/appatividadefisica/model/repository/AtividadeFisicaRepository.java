package br.edu.infnet.appatividadefisica.model.repository;

import br.edu.infnet.appatividadefisica.model.domain.ArtesMarciais;
import br.edu.infnet.appatividadefisica.model.domain.AtividadeFisica;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AtividadeFisicaRepository extends CrudRepository<AtividadeFisica, Integer> {

    @Query("from AtividadeFisica a where a.usuario.id =:userid")
    List<AtividadeFisica> obterLista(Integer userid);
}