package br.edu.infnet.appatividadefisica.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appatividadefisica.model.domain.ArtesMarciais;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ArtesMarciaisController {

    private static Map<Integer, ArtesMarciais> mapa = new HashMap<Integer, ArtesMarciais>();
    private static Integer id = 1;

    public static void incluir(ArtesMarciais artesMarciais) {
        artesMarciais.setId(id++);
        mapa.put(artesMarciais.getId(), artesMarciais);

        System.out.println("> " + artesMarciais);
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<ArtesMarciais> obterLista(){
        return mapa.values();
    }

    @GetMapping(value = "/artesmarciais/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());

        return "artesmarciais/lista";
    }

    @GetMapping(value = "/artesmarciais/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        excluir(id);

        return "redirect:/artesmarciais/lista";
    }
}
