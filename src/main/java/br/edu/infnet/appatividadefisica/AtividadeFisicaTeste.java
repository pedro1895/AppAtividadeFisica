package br.edu.infnet.appatividadefisica;


import br.edu.infnet.appatividadefisica.controller.AtividadeFisicaController;
import br.edu.infnet.appatividadefisica.model.domain.ArtesMarciais;
import br.edu.infnet.appatividadefisica.model.domain.Musculacao;
import br.edu.infnet.appatividadefisica.model.domain.Natacao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(3)
@Component
public class AtividadeFisicaTeste implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Cadastramento de Atividades Físicas ##");

        Natacao natacao = new Natacao();
        natacao.setCodigo(123);
        natacao.setNome("Natacao 111");
        natacao.setValor(10);
        natacao.setAquecimento(false);
        natacao.setInstrutor("Pedro");
        natacao.setFrequencia(5);
        AtividadeFisicaController.incluir(natacao);

        Musculacao musculacao = new Musculacao();
        musculacao.setCodigo(123);
        musculacao.setNome("Musculacao 222");
        musculacao.setValor(10);
        musculacao.setPersonal("João");
        musculacao.setSpinning(false);
        AtividadeFisicaController.incluir(musculacao);

        ArtesMarciais artesMarciais = new ArtesMarciais();
        artesMarciais.setCodigo(123);
        artesMarciais.setNome("ArtesMarciais 333");
        artesMarciais.setValor(10);
        artesMarciais.setEquipamento(true);
        artesMarciais.setTurma("Turma 111");
        artesMarciais.setProfessor("Lucas");
        AtividadeFisicaController.incluir(artesMarciais);
    }
}
