package br.edu.infnet.appatividadefisica.model.domain;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "t_usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String senha;

	@OneToMany
	@JoinColumn(name = "id_usuario")
	private List<Solicitante> solicitantes;

	@OneToMany
	@JoinColumn(name = "id_usuario")
	private List<Assinatura> assinaturas;

	@OneToMany
	@JoinColumn(name = "id_usuario")
	private List<AtividadeFisica> atividades;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;

	@Override
	public String toString() {
		return id + ";" + nome + ";" + email + ";" + senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Solicitante> getSolicitantes() {
		return solicitantes;
	}

	public void setSolicitantes(List<Solicitante> solicitantes) {
		this.solicitantes = solicitantes;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Assinatura> getAssinatura() {
		return assinaturas;
	}

	public void setAssinatura(List<Assinatura> assinaturas) {
		this.assinaturas = assinaturas;
	}

	public List<AtividadeFisica> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<AtividadeFisica> atividades) {
		this.atividades = atividades;
	}
}