package br.edu.infnet.appatividadefisica;

import br.edu.infnet.appatividadefisica.controller.ArtesMarciaisController;
import br.edu.infnet.appatividadefisica.model.domain.ArtesMarciais;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(4)
@Component
public class ArtesMarciaisTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Cadastramento de ArtesMarciais ##");

        ArtesMarciais s1 = new ArtesMarciais();
        s1.setCodigo(123);
        s1.setNome("ArtesMarciais 111");
        s1.setValor(10);
        s1.setEquipamento(false);
        s1.setTurma("ABCD111");
        s1.setProfessor("Paulo");
        ArtesMarciaisController.incluir(s1);

        ArtesMarciais s2 = new ArtesMarciais();
        s2.setCodigo(234);
        s2.setNome("ArtesMarciais 222");
        s2.setValor(15);
        s2.setEquipamento(true);
        s2.setTurma("ABCD222");
        s2.setProfessor("Elias");
        ArtesMarciaisController.incluir(s2);

        ArtesMarciais s3 = new ArtesMarciais();
        s3.setCodigo(345);
        s3.setNome("ArtesMarciais 333");
        s3.setValor(20);
        s3.setEquipamento(false);
        s3.setTurma("ABCD333");
        s3.setProfessor("Elizeu");
        ArtesMarciaisController.incluir(s3);
    }
}
