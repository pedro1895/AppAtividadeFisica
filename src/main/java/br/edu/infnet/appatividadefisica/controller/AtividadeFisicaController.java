package br.edu.infnet.appatividadefisica.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appatividadefisica.model.domain.AtividadeFisica;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class AtividadeFisicaController {

    private static Map<Integer, AtividadeFisica> mapa = new HashMap<Integer, AtividadeFisica>();
    private static Integer id = 1;

    public static void incluir(AtividadeFisica atividadefisica) {
        atividadefisica.setId(id++);
        mapa.put(atividadefisica.getId(), atividadefisica);

        System.out.println("> " + atividadefisica);
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<AtividadeFisica> obterLista(){
        return mapa.values();
    }

    @GetMapping(value = "/atividadefisica/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());

        return "atividadefisica/lista";
    }

    @GetMapping(value = "/atividadefisica/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        excluir(id);

        return "redirect:/atividadefisica/lista";
    }
}
