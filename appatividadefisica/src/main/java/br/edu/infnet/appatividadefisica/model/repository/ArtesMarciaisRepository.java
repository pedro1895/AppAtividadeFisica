package br.edu.infnet.appatividadefisica.model.repository;

import br.edu.infnet.appatividadefisica.model.domain.ArtesMarciais;
import br.edu.infnet.appatividadefisica.model.domain.Musculacao;
import br.edu.infnet.appatividadefisica.model.domain.Solicitante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ArtesMarciaisRepository extends CrudRepository<ArtesMarciais, Integer> {

    @Query("from ArtesMarciais s where s.usuario.id = :userid")
    List<ArtesMarciais> obterLista(Integer userid);
}