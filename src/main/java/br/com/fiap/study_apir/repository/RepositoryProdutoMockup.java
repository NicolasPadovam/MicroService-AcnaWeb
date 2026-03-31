package br.com.fiap.study_apir.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.fiap.study_apir.model.Produto;

public class RepositoryProdutoMockup {
    private List<Produto> produtos = new ArrayList<>();

    public RepositoryProdutoMockup() {
        Produto produto = new Produto();
        produto.setId(1L);
        produto.setNome("Maçã");
        produto.setValor(BigDecimal.valueOf(8.50));
        
        produtos.add(produto);

        produto.setId(3L);
        produto.setNome("Uva");
        produto.setValor(BigDecimal.valueOf(10.50));
    }

    public List<Produto> findAll() {
        return produtos;
    }

    public Optional<Produto> findById(Long id) {
        return produtos.stream()
        .filter(p -> p.getId().equals(id))
        .findFirst();
    }
}
