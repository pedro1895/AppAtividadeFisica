package br.edu.infnet.appatividadefisica.controller;

import br.edu.infnet.appatividadefisica.model.domain.Musculacao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MusculacaoController {

    private static Map<Integer, Musculacao> mapa = new HashMap<Integer, Musculacao>();
    private static Integer id = 1;

    public static void incluir(Musculacao musculacao) {
        musculacao.setId(id++);
        mapa.put(musculacao.getId(), musculacao);

        System.out.println("> " + musculacao);
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<Musculacao> obterLista(){
        return mapa.values();
    }

    @GetMapping(value = "/musculacao/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());

        return "musculacao/lista";
    }

    @GetMapping(value = "/musculacao/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        excluir(id);

        return "redirect:/musculacao/lista";
    }
}
