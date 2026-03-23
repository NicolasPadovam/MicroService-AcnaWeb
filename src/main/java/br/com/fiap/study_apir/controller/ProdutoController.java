package br.com.fiap.study_apir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public String createProduto(){
        return "Produto Criado";
    }

    @GetMapping("/{id}")
    public String findProdutoById(){
        return "Maça";
    }

    public String updateProduto(){
        return  "Produto atualizado";
    }

    public String deleteProduto(){
        return "Produto Excluido";
    }

}
