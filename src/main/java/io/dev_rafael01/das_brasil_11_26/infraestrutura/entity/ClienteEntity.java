package io.dev_rafael01.das_brasil_11_26.infraestrutura.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private Long id;

    @Column(name = "nome_cliente", nullable = false, length = 30)
    private String nome;

    @Column(name = "sistema_primeiro")
    private String sistemaPrimeiro;

    @Column(name = "sistema_secundario")
    private String sistemaSecundario;

    @Column(name = "sistema_terciario")
    private String sistemaTerciario;

    @Column(name = "config_cabecote")
    private String configCabecote;

    // O relacionamento é mapeado pelo campo "clientes" em UsuarioEntity.
    @ManyToMany(mappedBy = "clientes", fetch = FetchType.LAZY)
    @Builder.Default
    private Set<UsuarioEntity> usuarios = new HashSet<>();
}