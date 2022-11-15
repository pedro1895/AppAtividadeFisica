package br.edu.infnet.appatividadefisica.model.service;

import br.edu.infnet.appatividadefisica.model.domain.Musculacao;
import br.edu.infnet.appatividadefisica.model.domain.Natacao;
import br.edu.infnet.appatividadefisica.model.domain.Usuario;
import br.edu.infnet.appatividadefisica.model.repository.MusculacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class MusculacaoService {
	
	@Autowired
	private MusculacaoRepository musculacaoRepository;

	public void incluir(Musculacao musculacao) {
		musculacaoRepository.save(musculacao);
	}
	
	public void excluir(Integer id) {
		musculacaoRepository.deleteById(id);
	}
	
	public Collection<Musculacao> obterLista(){
		return (Collection<Musculacao>) musculacaoRepository.findAll();
	}

	public Collection<Musculacao> obterLista(Usuario usuario){
		return musculacaoRepository.obterLista(usuario.getId());
	}

}