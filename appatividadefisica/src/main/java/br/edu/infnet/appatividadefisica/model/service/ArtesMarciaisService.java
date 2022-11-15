package br.edu.infnet.appatividadefisica.model.service;

import br.edu.infnet.appatividadefisica.model.domain.ArtesMarciais;
import br.edu.infnet.appatividadefisica.model.domain.Musculacao;
import br.edu.infnet.appatividadefisica.model.domain.Usuario;
import br.edu.infnet.appatividadefisica.model.repository.ArtesMarciaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class ArtesMarciaisService {
	
	@Autowired
	private ArtesMarciaisRepository artesMarciaisRepository;

	public void incluir(ArtesMarciais artesMarciais) {
		artesMarciaisRepository.save(artesMarciais);
	}
	
	public void excluir(Integer id) {
		artesMarciaisRepository.deleteById(id);
	}
	
	public Collection<ArtesMarciais> obterLista(){
		return (Collection<ArtesMarciais>) artesMarciaisRepository.findAll();
	}

	public Collection<ArtesMarciais> obterLista(Usuario usuario){
		return artesMarciaisRepository.obterLista(usuario.getId());
	}
}