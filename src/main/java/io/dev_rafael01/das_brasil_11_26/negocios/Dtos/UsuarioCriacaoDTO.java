package io.dev_rafael01.das_brasil_11_26.negocios.Dtos;

import io.dev_rafael01.das_brasil_11_26.enum1.PerfilUsuario;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioCriacaoDTO {

    private String nome;
    private String email;
    private String cargo;
    private String telefone;
    private String senha;
    private PerfilUsuario perfil;

    // IDs dos clientes aos quais o usuário será associado.
    @Builder.Default
    private Set<Long> clienteIds = Set.of();
}