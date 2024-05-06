package com.br.api.assado.domains;

import java.math.BigDecimal;

import com.br.api.assado.domains.enums.Categoria;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "PRODUTOS")
@Data
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long produtoId;

    private String descricao;
    private String nome;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    
    private BigDecimal precio;
    private String tempoEspera;
}
