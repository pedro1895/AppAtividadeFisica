package br.edu.infnet.appatividadefisica.model.service;

import br.edu.infnet.appatividadefisica.model.domain.Natacao;
import br.edu.infnet.appatividadefisica.model.repository.NatacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class NatacaoService {
	
	@Autowired
	private NatacaoRepository natacaoRepository;

	public void incluir(Natacao natacao) {
		natacaoRepository.save(natacao);
	}
	
	public void excluir(Integer id) {
		natacaoRepository.deleteById(id);
	}
	
	public Collection<Natacao> obterLista(){
		return (Collection<Natacao>) natacaoRepository.findAll();
	}		
}