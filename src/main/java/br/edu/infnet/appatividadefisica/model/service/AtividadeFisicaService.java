package br.edu.infnet.appatividadefisica.model.service;

import br.edu.infnet.appatividadefisica.model.domain.AtividadeFisica;
import br.edu.infnet.appatividadefisica.model.repository.AtividadeFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class AtividadeFisicaService {
	
	@Autowired
	private AtividadeFisicaRepository atividadeFisicaRepository;

	public void incluir(AtividadeFisica AtividadeFisica) {
		atividadeFisicaRepository.save(AtividadeFisica);
	}
	
	public void excluir(Integer id) {
		atividadeFisicaRepository.deleteById(id);
	}
	
	public Collection<AtividadeFisica> obterLista(){
		return (Collection<AtividadeFisica>) atividadeFisicaRepository.findAll();
	}		
}