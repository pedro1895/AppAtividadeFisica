package br.edu.infnet.appatividadefisica.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appatividadefisica.model.domain.Assinatura;
import br.edu.infnet.appatividadefisica.model.domain.Assinatura;
import br.edu.infnet.appatividadefisica.model.domain.Usuario;
import br.edu.infnet.appatividadefisica.model.service.AssinaturaService;
import br.edu.infnet.appatividadefisica.model.service.AtividadeFisicaService;
import br.edu.infnet.appatividadefisica.model.service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
public class AssinaturaController {

    @Autowired
    private AssinaturaService assinaturaService;

    @Autowired
    private SolicitanteService solicitanteService;

    @Autowired
    private AtividadeFisicaService atividadeFisicaService;

    @GetMapping(value = "/assinatura")
    public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("solicitantes", solicitanteService.obterLista(usuario));

        model.addAttribute("atividades", atividadeFisicaService.obterLista(usuario));

        return "assinatura/cadastro";
    }

    @PostMapping(value = "/assinatura/incluir")
    public String incluir(Assinatura assinatura, @SessionAttribute("user") Usuario usuario) {

        System.out.println("Solicitante: " + assinatura.getSolicitante());
        System.out.println("Atividades: " + assinatura.getAtividades());

        assinatura.setUsuario(usuario);

        assinaturaService.incluir(assinatura);

        System.out.println("> " + assinatura);

        return "redirect:/assinatura/lista";
    }

    @GetMapping(value = "/assinatura/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("listagem", assinaturaService.obterLista(usuario));

        return "assinatura/lista";
    }

    @GetMapping(value = "/assinatura/{id}/excluir")
    public String excluir(@PathVariable Integer id) {

        assinaturaService.excluir(id);

        return "redirect:/assinatura/lista";
    }
}
