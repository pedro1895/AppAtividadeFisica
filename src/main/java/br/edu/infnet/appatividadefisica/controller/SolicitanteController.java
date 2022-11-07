package br.edu.infnet.appatividadefisica.controller;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appatividadefisica.model.domain.Solicitante;
import br.edu.infnet.appatividadefisica.model.domain.Usuario;
import br.edu.infnet.appatividadefisica.model.service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
public class SolicitanteController {

    @Autowired
    private SolicitanteService solicitanteService;

    @GetMapping(value = "/solicitante")
    public String telaCadastro() {
        return "solicitante/cadastro";
    }

    @PostMapping(value = "/solicitante/incluir")
    public void incluir(Solicitante solicitante, @SessionAttribute("user") Usuario usuario) {

        solicitanteService.incluir(solicitante);

        System.out.println("> " + solicitante);
    }

    @GetMapping(value = "/solicitante/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", solicitanteService.obterLista());

        return "solicitante/lista";
    }

    @GetMapping(value = "/solicitante/{id}/excluir")
    public String excluir(@PathVariable Integer id) {

        solicitanteService.excluir(id);

        return "redirect:/solicitante/lista";
    }
}
