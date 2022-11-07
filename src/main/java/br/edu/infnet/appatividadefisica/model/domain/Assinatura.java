package br.edu.infnet.appatividadefisica.model.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "t_assinatura")
public class Assinatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime data;
    private boolean web;
    @Transient
    private Solicitante solicitante;
    @Transient
    private List<AtividadeFisica> atividades;


    public Assinatura() {
        data = LocalDateTime.now();
        web = true;
    }

    public Assinatura(Solicitante solicitante) {
        this();
        this.solicitante = solicitante;
    }

    @Override
    public String toString() {
        return id + ";" + descricao + ";" + data + ";" + web + ";" + solicitante + ";" + atividades.size();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public List<AtividadeFisica> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<AtividadeFisica> atividades) {
        this.atividades = atividades;
    }
}
