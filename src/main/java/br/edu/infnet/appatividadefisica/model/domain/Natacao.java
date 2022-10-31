package br.edu.infnet.appatividadefisica.model.domain;

public class Natacao extends AtividadeFisica{

    private String instrutor;
    private int frequencia;
    private boolean aquecimento;

    @Override
    public String toString() {
        return super.toString() + ";" + instrutor + ";" + frequencia + ";" + aquecimento;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public boolean isAquecimento() {
        return aquecimento;
    }

    public void setAquecimento(boolean aquecimento) {
        this.aquecimento = aquecimento;
    }

}
