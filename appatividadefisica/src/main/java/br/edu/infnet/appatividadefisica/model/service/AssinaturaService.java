package br.edu.infnet.appatividadefisica.model.service;

import br.edu.infnet.appatividadefisica.model.domain.Assinatura;
import br.edu.infnet.appatividadefisica.model.domain.Usuario;
import br.edu.infnet.appatividadefisica.model.repository.AssinaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;


@Service
public class AssinaturaService {
	
	private AssinaturaRepository assinaturaRepository;

	public AssinaturaService(AssinaturaRepository assinaturaRepository) {
		this.assinaturaRepository = assinaturaRepository;
	}

	public void incluir(Assinatura assinatura) {
		assinatura.setData(LocalDateTime.now());
		assinaturaRepository.save(assinatura);
	}

	public void excluir(Integer id) {
		assinaturaRepository.deleteById(id);
	}
	
	public Collection<Assinatura> obterLista(){
		return (Collection<Assinatura>) assinaturaRepository.findAll();
	}

	public Collection<Assinatura> obterLista(Usuario usuario){
		return assinaturaRepository.obterLista(usuario.getId());
	}
}