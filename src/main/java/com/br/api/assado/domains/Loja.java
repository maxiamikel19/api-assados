package com.br.api.assado.domains;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "LOJAS")
@Data
public class Loja {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLoja;
    
    private String nome;
    private String descricao;
    private String imageUrl;
    private String cnpj;
    private LocalDate dataCadastro;
    private String contato;
    private Double avaliacao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "idEndereco")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "propietario_id")
    private Propietario propietario;
}
