package br.edu.infnet.appatividadefisica.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Assinatura {
    private Integer id;
    private String descricao;
    private LocalDateTime data;
    private boolean web;
    private Solicitante solicitante;
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
