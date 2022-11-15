package br.edu.infnet.appatividadefisica.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appatividadefisica.model.domain.AtividadeFisica;
import br.edu.infnet.appatividadefisica.model.domain.AtividadeFisica;
import br.edu.infnet.appatividadefisica.model.domain.Usuario;
import br.edu.infnet.appatividadefisica.model.service.AtividadeFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
public class AtividadeFisicaController {

    @Autowired
    private AtividadeFisicaService atividadeFisicaService;

    @GetMapping(value = "/atividadefisica")
    public String telaCadastro() {
        return "atividadefisica/cadastro";
    }

    @PostMapping(value = "/atividadefisica/incluir")
    public String incluir(AtividadeFisica atividadeFisica, @SessionAttribute("user") Usuario usuario) {

        atividadeFisica.setUsuario(usuario);

        atividadeFisicaService.incluir(atividadeFisica);

        System.out.println("> " + atividadeFisica);

        return "redirect:/atividadefisica/lista";
    }

    @GetMapping(value = "/atividadefisica/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("listagem", atividadeFisicaService.obterLista(usuario));

        return "atividadefisica/lista";
    }

    @GetMapping(value = "/atividadefisica/{id}/excluir")
    public String excluir(@PathVariable Integer id) {

        atividadeFisicaService.excluir(id);

        return "redirect:/atividadefisica/lista";
    }
}
