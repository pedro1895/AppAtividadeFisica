package br.edu.infnet.appatividadefisica.model.service;

import br.edu.infnet.appatividadefisica.model.domain.Assinatura;
import br.edu.infnet.appatividadefisica.model.domain.Usuario;
import br.edu.infnet.appatividadefisica.model.repository.AssinaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;


@Service
public class AssinaturaService {
	
	@Autowired
	private AssinaturaRepository assinaturaRepository;

	@Autowired
	private SolicitanteService solicitanteService;

	@Autowired
	private AtividadeFisicaService atividadeFisicaService;


	public void incluir(Assinatura assinatura) {
		assinatura.setData(LocalDateTime.now());
		//assinatura.setSolicitante(solicitanteService.obterLista().stream().findFirst().get());
		//assinatura.setAtividades(atividadeFisicaService.obterLista().stream().collect(Collectors.toList()));
		assinaturaRepository.save(assinatura);
	}

	public void excluir(Integer id) {
		assinaturaRepository.deleteById(id);
	}
	
	public Collection<Assinatura> obterLista(){
		return (Collection<Assinatura>) assinaturaRepository.findAll();
	}		
}