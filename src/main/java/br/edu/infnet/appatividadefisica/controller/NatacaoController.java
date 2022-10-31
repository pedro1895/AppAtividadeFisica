package br.edu.infnet.appatividadefisica.controller;

import br.edu.infnet.appatividadefisica.model.domain.Natacao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class NatacaoController {

    private static Map<Integer, Natacao> mapa = new HashMap<Integer, Natacao>();
    private static Integer id = 1;

    public static void incluir(Natacao natacao) {
        natacao.setId(id++);
        mapa.put(natacao.getId(), natacao);

        System.out.println("> " + natacao);
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<Natacao> obterLista(){
        return mapa.values();
    }

    @GetMapping(value = "/natacao/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());

        return "natacao/lista";
    }

    @GetMapping(value = "/natacao/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        excluir(id);

        return "redirect:/natacao/lista";
    }
}
