package com.br.api.assado.domains;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table
@Data
public class Propietario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPropietario;

    private String nome;
    private String cpf;
    private String email;
    private String contato;
    private String senha;

    @Temporal(TemporalType.DATE)
    private LocalDate dataCadastro;

    @OneToMany(mappedBy = "propietario")
    private List<Loja> lojas = new ArrayList<>();
}
