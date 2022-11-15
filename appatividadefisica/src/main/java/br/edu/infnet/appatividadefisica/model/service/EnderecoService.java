package br.edu.infnet.appatividadefisica.model.service;

import br.edu.infnet.appatividadefisica.clients.IEnderecoClient;
import br.edu.infnet.appatividadefisica.model.domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EnderecoService {
	
	@Autowired
	private IEnderecoClient enderecoClient;

	public Endereco obterCep(String cep) {
		return enderecoClient.obterCep(cep);
	}

}
