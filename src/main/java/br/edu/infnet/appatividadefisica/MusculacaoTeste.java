package br.edu.infnet.appatividadefisica;

import br.edu.infnet.appatividadefisica.controller.MusculacaoController;
import br.edu.infnet.appatividadefisica.model.domain.Musculacao;
import br.edu.infnet.appatividadefisica.model.service.AtividadeFisicaService;
import br.edu.infnet.appatividadefisica.model.service.MusculacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(6)
@Component
public class MusculacaoTeste implements ApplicationRunner {


    private final MusculacaoService musculacaoService;

    public MusculacaoTeste(MusculacaoService musculacaoService) {
        this.musculacaoService = musculacaoService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Cadastramento de Musculacao ##");

        Musculacao s1 = new Musculacao();
        s1.setCodigo(123);
        s1.setNome("Musculacao 111");
        s1.setValor(10);
        s1.setSpinning(true);
        s1.setPersonal("Thiago");
        musculacaoService.incluir(s1);

        Musculacao s2 = new Musculacao();
        s2.setCodigo(234);
        s2.setNome("Musculacao 222");
        s2.setValor(15);
        s2.setSpinning(true);
        s2.setPersonal("Mateus");
        musculacaoService.incluir(s2);

        Musculacao s3 = new Musculacao();
        s3.setCodigo(345);
        s3.setNome("Musculacao 333");
        s3.setValor(20);
        s3.setSpinning(true);
        s3.setPersonal("Lucas");
        musculacaoService.incluir(s3);
    }
}
