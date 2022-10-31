package br.edu.infnet.appatividadefisica.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appatividadefisica.model.domain.Assinatura;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
public class AssinaturaController {

    private static Map<Integer, Assinatura> mapa = new HashMap<Integer, Assinatura>();
    private static Integer id = 1;

    public static void incluir(Assinatura assinatura) {
        assinatura.setId(id++);
        mapa.put(assinatura.getId(), assinatura);

        System.out.println("> " + assinatura);
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<Assinatura> obterLista(){
        return mapa.values();
    }

    @GetMapping(value = "/assinatura/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());

        return "assinatura/lista";
    }

    @GetMapping(value = "/assinatura/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        excluir(id);

        return "redirect:/assinatura/lista";
    }
}
