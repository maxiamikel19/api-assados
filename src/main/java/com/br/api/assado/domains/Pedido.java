package com.br.api.assado.domains;

import java.time.LocalDateTime;
import java.util.List;

import com.br.api.assado.domains.enums.StatusPedido;
import com.br.api.assado.domains.enums.TipoPagamento;
import com.br.api.assado.domains.enums.TipoPedido;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "PEDIDOS")
@Data
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    private String cliente;
    private String endereco;
    private String telefone;

    @Enumerated(EnumType.STRING)
    private TipoPagamento tipoPagamento;

    @Enumerated(EnumType.STRING)
    private TipoPedido tipoPedido;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dataPedido;

    @Enumerated(EnumType.STRING)
    private StatusPedido statusPedido;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itemsPedido;
}
