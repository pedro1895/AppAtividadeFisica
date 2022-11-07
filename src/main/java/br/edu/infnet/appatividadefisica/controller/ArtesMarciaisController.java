package br.edu.infnet.appatividadefisica.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appatividadefisica.model.domain.ArtesMarciais;
import br.edu.infnet.appatividadefisica.model.domain.ArtesMarciais;
import br.edu.infnet.appatividadefisica.model.service.ArtesMarciaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArtesMarciaisController {

    @Autowired
    private ArtesMarciaisService artesMarciaisService;

    @GetMapping(value = "/artesmarciais")
    public String telaCadastro() {
        return "artesmarciais/cadastro";
    }

    @PostMapping(value = "/artesmarciais/incluir")
    public void incluir(ArtesMarciais artesmarciais) {
        artesMarciaisService.incluir(artesmarciais);

        System.out.println("> " + artesmarciais);
    }

    @GetMapping(value = "/artesmarciais/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", artesMarciaisService.obterLista());

        return "artesmarciais/lista";
    }

    @GetMapping(value = "/artesmarciais/{id}/excluir")
    public String excluir(@PathVariable Integer id) {

        artesMarciaisService.excluir(id);

        return "redirect:/artesmarciais/lista";
    }
}
