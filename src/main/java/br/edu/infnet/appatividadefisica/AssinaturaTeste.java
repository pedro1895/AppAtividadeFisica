package br.edu.infnet.appatividadefisica;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appatividadefisica.controller.AssinaturaController;
import br.edu.infnet.appatividadefisica.model.domain.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class AssinaturaTeste implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Cadastramento de Assinaturas ##");

        Natacao natacao = new Natacao();
        natacao.setCodigo(123);
        natacao.setNome("Natacao 111");
        natacao.setValor(10);
        natacao.setAquecimento(false);
        natacao.setInstrutor("Pedro");
        natacao.setFrequencia(5);

        Musculacao musculacao = new Musculacao();
        musculacao.setCodigo(123);
        musculacao.setNome("Musculacao 222");
        musculacao.setValor(10);
        musculacao.setPersonal("João");
        musculacao.setSpinning(false);

        ArtesMarciais artesMarciais = new ArtesMarciais();
        artesMarciais.setCodigo(123);
        artesMarciais.setNome("ArtesMarciais 333");
        artesMarciais.setValor(10);
        artesMarciais.setEquipamento(true);
        artesMarciais.setTurma("Turma 111");
        artesMarciais.setProfessor("Lucas");

        Solicitante s1 = new Solicitante();
        s1.setCpf("12312312312");
        s1.setEmail("solicita@primeiro.com");
        s1.setNome("Primeiro solicitante");

        List<AtividadeFisica> atividadesFisicasPrimeiraAssinatura = new ArrayList<AtividadeFisica>();
        atividadesFisicasPrimeiraAssinatura.add(natacao);
        atividadesFisicasPrimeiraAssinatura.add(musculacao);

        List<AtividadeFisica> atividadesFisicasDemaisAssinaturas = new ArrayList<AtividadeFisica>();
        atividadesFisicasDemaisAssinaturas.add(natacao);
        atividadesFisicasDemaisAssinaturas.add(musculacao);
        atividadesFisicasDemaisAssinaturas.add(artesMarciais);

        Assinatura a1 = new Assinatura(s1);
        a1.setDescricao("Primeira assinatura");
        a1.setWeb(true);
        a1.setAtividades(atividadesFisicasPrimeiraAssinatura);
        AssinaturaController.incluir(a1);

        Assinatura a2 = new Assinatura();
        a2.setDescricao("Segunda assinatura");
        a2.setWeb(false);
        a2.setSolicitante(s1);
        a2.setAtividades(atividadesFisicasDemaisAssinaturas);
        AssinaturaController.incluir(a2);

        Solicitante s2 = new Solicitante();
        s2.setCpf("23423423423");
        s2.setEmail("solicita@segundo.com");
        s2.setNome("Segundo solicitante");

        Assinatura a3 = new Assinatura();
        a3.setDescricao("Terceira assinatura");
        a3.setSolicitante(s2);
        a3.setAtividades(atividadesFisicasDemaisAssinaturas);
        AssinaturaController.incluir(a3);

    }
}
