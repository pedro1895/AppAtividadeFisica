package br.edu.infnet.appatividadefisica.controller;

import br.edu.infnet.appatividadefisica.model.domain.Musculacao;
import br.edu.infnet.appatividadefisica.model.domain.Musculacao;
import br.edu.infnet.appatividadefisica.model.domain.Usuario;
import br.edu.infnet.appatividadefisica.model.service.MusculacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MusculacaoController {

    @Autowired
    private MusculacaoService musculacaoService;

    @GetMapping(value = "/musculacao")
    public String telaCadastro() {
        return "musculacao/cadastro";
    }

    @PostMapping(value = "/musculacao/incluir")
    public String incluir(Musculacao musculacao, @SessionAttribute("user") Usuario usuario) {

        musculacao.setUsuario(usuario);

        musculacaoService.incluir(musculacao);

        System.out.println("> " + musculacao);

        return "redirect:/musculacao/lista";
    }

    @GetMapping(value = "/musculacao/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario ) {
        model.addAttribute("listagem", musculacaoService.obterLista(usuario));

        return "musculacao/lista";
    }

    @GetMapping(value = "/musculacao/{id}/excluir")
    public String excluir(@PathVariable Integer id) {

        musculacaoService.excluir(id);

        return "redirect:/musculacao/lista";
    }
}
