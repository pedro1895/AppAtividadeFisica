package br.edu.infnet.appatividadefisica;


import br.edu.infnet.appatividadefisica.controller.AtividadeFisicaController;
import br.edu.infnet.appatividadefisica.model.domain.ArtesMarciais;
import br.edu.infnet.appatividadefisica.model.domain.Musculacao;
import br.edu.infnet.appatividadefisica.model.domain.Natacao;
import br.edu.infnet.appatividadefisica.model.service.AssinaturaService;
import br.edu.infnet.appatividadefisica.model.service.AtividadeFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(3)
@Component
public class AtividadeFisicaTeste implements ApplicationRunner{

    private final AtividadeFisicaService atividadeFisicaService;

    public AtividadeFisicaTeste(AtividadeFisicaService atividadeFisicaService) {
        this.atividadeFisicaService = atividadeFisicaService;
    }

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
        atividadeFisicaService.incluir(natacao);

        Musculacao musculacao = new Musculacao();
        musculacao.setCodigo(123);
        musculacao.setNome("Musculacao 222");
        musculacao.setValor(10);
        musculacao.setPersonal("João");
        musculacao.setSpinning(false);
        atividadeFisicaService.incluir(musculacao);

        ArtesMarciais artesMarciais = new ArtesMarciais();
        artesMarciais.setCodigo(123);
        artesMarciais.setNome("ArtesMarciais 333");
        artesMarciais.setValor(10);
        artesMarciais.setEquipamento(true);
        artesMarciais.setTurma("Turma 111");
        artesMarciais.setProfessor("Lucas");
        atividadeFisicaService.incluir(artesMarciais);
    }
}
