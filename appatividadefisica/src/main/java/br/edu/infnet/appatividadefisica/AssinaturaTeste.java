package br.edu.infnet.appatividadefisica;

import java.util.ArrayList;
import java.util.List;


import br.edu.infnet.appatividadefisica.model.domain.*;
import br.edu.infnet.appatividadefisica.model.service.AssinaturaService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(7)
@Component
public class AssinaturaTeste implements ApplicationRunner{

    private final AssinaturaService assinaturaService;

    public AssinaturaTeste(AssinaturaService assinaturaService) {
        this.assinaturaService = assinaturaService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Cadastramento de Assinaturas ##");

        Usuario usuario = new Usuario();
        usuario.setId(1);

        Natacao natacao = new Natacao();
        natacao.setId(1);

        Musculacao musculacao = new Musculacao();
        musculacao.setId(1);

        ArtesMarciais artesMarciais = new ArtesMarciais();
        artesMarciais.setId(1);

        Solicitante s1 = new Solicitante();
        s1.setId(1);

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
        a1.setUsuario(usuario);
        a1.setAtividades(atividadesFisicasPrimeiraAssinatura);
        assinaturaService.incluir(a1);

        Assinatura a2 = new Assinatura();
        a2.setDescricao("Segunda assinatura");
        a2.setWeb(false);
        a2.setSolicitante(s1);
        a2.setUsuario(usuario);
        a2.setAtividades(atividadesFisicasDemaisAssinaturas);
        assinaturaService.incluir(a2);

        Solicitante s2 = new Solicitante();
        s2.setId(2);

        Assinatura a3 = new Assinatura();
        a3.setDescricao("Terceira assinatura");
        a3.setSolicitante(s2);
        a3.setUsuario(usuario);
        a3.setAtividades(atividadesFisicasDemaisAssinaturas);
        assinaturaService.incluir(a3);

    }
}
