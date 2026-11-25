package io.dev_rafael01.das_brasil_11_26.infraestrutura.entity;

import io.dev_rafael01.das_brasil_11_26.enum1.PerfilUsuario;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long id;

    @Column(name = "nome_usuario", nullable = false, length = 100, unique = true)
    private String nome;

    @Column(name = "email", nullable = false, length = 60, unique = true)
    private String email;

    @Column(name = "cargo", length = 20)
    private String cargo;

    @Column(name = "telefone", length = 15)
    private String telefone;

    @Column(name = "senha", nullable = false, length = 255)
    private String senha;

    @Enumerated(EnumType.STRING)
    @Column(name = "perfil_usuario", nullable = false)
    private PerfilUsuario perfil;

    // UsuarioEntity é o lado que controla a tabela de associação.
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "usuarios_clientes",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "cliente_id")
    )
    @Builder.Default
    private Set<ClienteEntity> clientes = new HashSet<>();
}