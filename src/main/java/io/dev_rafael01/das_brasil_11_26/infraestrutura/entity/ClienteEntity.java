package io.dev_rafael01.das_brasil_11_26.infraestrutura.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private Long cliente_id;

    @Column(name = "nome_cliente", nullable = false, length = 30)
    private String nome;

    @Column(name = "sistemaPrimeiro")
    private String sistemaPrimeira;

    @Column(name = "sistemaSegundaria")
    private String sistemaSegundario;

    @Column(name = "sistemaTerciario")
    private String sistemaTerciario;

    @Column(name = "confiCabecote")
    private String confiCabecote;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private UsuarioEntity usuario;




}
