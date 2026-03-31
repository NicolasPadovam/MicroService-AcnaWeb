package br.com.fiap.study_apir.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
    private Long id;
    private String nome;
    private BigDecimal valor; 
}
