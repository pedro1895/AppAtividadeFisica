package br.edu.infnet.appatividadefisica.model.domain;

public class Musculacao extends AtividadeFisica{

    private String personal;
    private boolean spinning;

    @Override
    public String toString() {
        return super.toString() + ";" + personal + ";" + spinning;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public boolean isSpinning() {
        return spinning;
    }

    public void setSpinning(boolean spinning) {
        this.spinning = spinning;
    }

}
