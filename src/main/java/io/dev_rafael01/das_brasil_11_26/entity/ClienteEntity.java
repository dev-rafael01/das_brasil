package io.dev_rafael01.das_brasil_11_26.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter
@Setter
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Long cliente_id;

    @Column(name = "nome_cliente", nullable = false, length = 30)
    private String nome;



}
