package br.edu.infnet.appatividadefisica.controller;

import br.edu.infnet.appatividadefisica.model.domain.Natacao;
import br.edu.infnet.appatividadefisica.model.domain.Usuario;
import br.edu.infnet.appatividadefisica.model.service.NatacaoService;
import br.edu.infnet.appatividadefisica.model.service.SolicitanteService;
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
public class NatacaoController {

    @Autowired
    private NatacaoService natacaoService;

    @GetMapping(value = "/natacao")
    public String telaCadastro() {
        return "natacao/cadastro";
    }

    @PostMapping(value = "/natacao/incluir")
    public String incluir(Natacao natacao, @SessionAttribute("user") Usuario usuario) {

        natacao.setUsuario(usuario);

        natacaoService.incluir(natacao);

        System.out.println("> " + natacao);

        return "redirect:/natacao/lista";
    }

    @GetMapping(value = "/natacao/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("listagem", natacaoService.obterLista(usuario));

        return "natacao/lista";
    }

    @GetMapping(value = "/natacao/{id}/excluir")
    public String excluir(@PathVariable Integer id) {

        natacaoService.excluir(id);

        return "redirect:/natacao/lista";
    }
}
