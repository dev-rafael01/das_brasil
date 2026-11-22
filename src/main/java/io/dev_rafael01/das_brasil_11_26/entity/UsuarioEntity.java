package io.dev_rafael01.das_brasil_11_26.entity;

import io.dev_rafael01.das_brasil_11_26.enum1.PerfilUsuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Long usuario_id;

    @Column(name = "nome_usuario", nullable = false, length = 100, unique = true)
    private String nome;

    @Column(name = "email", nullable = false, length = 60, unique = true)
    private String email;

    @Column(name = "cargo", length = 20)
    private String cargo;

    @Column(name = "telefone", length = 15)
    private String telefone;

    @Column(name = "senha_usuario", length = 255)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "perfil_usuario", nullable = false)
    private PerfilUsuario perfil;
}
