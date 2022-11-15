package br.edu.infnet.appatividadefisica;

import br.edu.infnet.appatividadefisica.controller.NatacaoController;
import br.edu.infnet.appatividadefisica.model.domain.Natacao;
import br.edu.infnet.appatividadefisica.model.domain.Usuario;
import br.edu.infnet.appatividadefisica.model.service.MusculacaoService;
import br.edu.infnet.appatividadefisica.model.service.NatacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(5)
@Component
public class NatacaoTeste implements ApplicationRunner {

    private final NatacaoService natacaoService;

    public NatacaoTeste(NatacaoService natacaoService) {
        this.natacaoService = natacaoService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Cadastramento de Natacao ##");

        Usuario usuario = new Usuario();
        usuario.setId(1);

        Natacao s1 = new Natacao();
        s1.setCodigo(123);
        s1.setNome("Natacao 111");
        s1.setValor(10);
        s1.setAquecimento(true);
        s1.setFrequencia(5);
        s1.setInstrutor("José");
        s1.setUsuario(usuario);
        natacaoService.incluir(s1);

        Natacao s2 = new Natacao();
        s2.setCodigo(234);
        s2.setNome("Natacao 222");
        s2.setValor(15);
        s2.setAquecimento(true);
        s2.setFrequencia(3);
        s2.setInstrutor("Pedro");
        s2.setUsuario(usuario);
        natacaoService.incluir(s2);

        Natacao s3 = new Natacao();
        s3.setCodigo(345);
        s3.setNome("Natacao 333");
        s3.setValor(20);
        s3.setAquecimento(true);
        s3.setFrequencia(2);
        s3.setInstrutor("João");
        s3.setUsuario(usuario);
        natacaoService.incluir(s3);
    }
}
