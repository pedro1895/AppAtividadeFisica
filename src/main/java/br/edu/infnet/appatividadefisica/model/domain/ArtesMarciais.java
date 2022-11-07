package br.edu.infnet.appatividadefisica.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_artes_marciais")
public class ArtesMarciais extends AtividadeFisica{

    private String professor;
    private String turma;
    private boolean equipamento;

    @Override
    public String toString() {
        return super.toString() + ";" + professor + ";" + turma + ";" + equipamento;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public boolean isEquipamento() {
        return equipamento;
    }

    public void setEquipamento(boolean equipamento) {
        this.equipamento = equipamento;
    }
}
