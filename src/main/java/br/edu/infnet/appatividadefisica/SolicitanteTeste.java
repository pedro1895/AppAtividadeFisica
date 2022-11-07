package br.edu.infnet.appatividadefisica;

import br.edu.infnet.appatividadefisica.controller.SolicitanteController;
import br.edu.infnet.appatividadefisica.model.domain.Solicitante;
import br.edu.infnet.appatividadefisica.model.service.NatacaoService;
import br.edu.infnet.appatividadefisica.model.service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class SolicitanteTeste implements ApplicationRunner{

    private final SolicitanteService solicitanteService;

    public SolicitanteTeste(SolicitanteService solicitanteService) {
        this.solicitanteService = solicitanteService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Cadastramento de Solicitantes ##");

        Solicitante s1 = new Solicitante();
        s1.setCpf("12312312312");
        s1.setEmail("solicita@primeiro.com");
        s1.setNome("Primeiro solicitante");
        solicitanteService.incluir(s1);

        Solicitante s2 = new Solicitante();
        s2.setCpf("23423423423");
        s2.setEmail("solicita@segundo.com");
        s2.setNome("Segundo solicitante");
        solicitanteService.incluir(s2);

        Solicitante s3 = new Solicitante();
        s3.setCpf("34534534534");
        s3.setEmail("solicita@terceiro.com");
        s3.setNome("Terceiro solicitante");
        solicitanteService.incluir(s3);
    }
}
