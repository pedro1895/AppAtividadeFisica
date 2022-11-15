package br.edu.infnet.appatividadefisica.model.service;

import java.util.Collection;

import br.edu.infnet.appatividadefisica.model.domain.Solicitante;
import br.edu.infnet.appatividadefisica.model.domain.Usuario;
import br.edu.infnet.appatividadefisica.model.repository.SolicitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SolicitanteService {
	
	@Autowired
	private SolicitanteRepository solicitanteRepository;

	public void incluir(Solicitante solicitante) {
		solicitanteRepository.save(solicitante);
	}
	
	public void excluir(Integer id) {
		solicitanteRepository.deleteById(id);
	}
	
	public Collection<Solicitante> obterLista(){
		return (Collection<Solicitante>) solicitanteRepository.findAll();
	}

	public Collection<Solicitante> obterLista(Usuario usuario){
		return solicitanteRepository.obterLista(usuario.getId());
	}
}