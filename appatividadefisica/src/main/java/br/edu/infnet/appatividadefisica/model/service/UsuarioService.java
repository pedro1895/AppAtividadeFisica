package br.edu.infnet.appatividadefisica.model.service;

import java.util.Collection;

import br.edu.infnet.appatividadefisica.clients.IEnderecoClient;
import br.edu.infnet.appatividadefisica.clients.IUsuarioClient;
import br.edu.infnet.appatividadefisica.model.domain.Endereco;
import br.edu.infnet.appatividadefisica.model.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {

	@Autowired
	private IUsuarioClient usuarioClient;

	public void incluir(Usuario usuario) {
		usuarioClient.incluir(usuario);
	}

	public void excluir(Integer id) {
		usuarioClient.excluir(id);
	}

	public Collection<Usuario> obterLista(){
		return usuarioClient.obterLista();
	}

	public Usuario validar(String email, String senha) {

		return usuarioClient.validar(email, senha);
	}

}