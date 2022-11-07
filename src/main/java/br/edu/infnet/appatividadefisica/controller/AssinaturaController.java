package br.edu.infnet.appatividadefisica.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appatividadefisica.model.domain.Assinatura;
import br.edu.infnet.appatividadefisica.model.domain.Assinatura;
import br.edu.infnet.appatividadefisica.model.domain.Usuario;
import br.edu.infnet.appatividadefisica.model.service.AssinaturaService;
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

    @GetMapping(value = "/assinatura")
    public String telaCadastro() {
        return "assinatura/cadastro";
    }

    @PostMapping(value = "/assinatura/incluir")
    public void incluir(Assinatura assinatura, @SessionAttribute("user") Usuario usuario) {

        assinaturaService.incluir(assinatura);

        System.out.println("> " + assinatura);
    }

    @GetMapping(value = "/assinatura/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", assinaturaService.obterLista());

        return "assinatura/lista";
    }

    @GetMapping(value = "/assinatura/{id}/excluir")
    public String excluir(@PathVariable Integer id) {

        assinaturaService.excluir(id);

        return "redirect:/assinatura/lista";
    }
}
