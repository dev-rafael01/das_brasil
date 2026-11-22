package io.dev_rafael01.das_brasil_11_26.negocios.Dtos;

import io.dev_rafael01.das_brasil_11_26.infraestrutura.entity.ClienteEntity;
import io.dev_rafael01.das_brasil_11_26.enum1.PerfilUsuario;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {

    private Long usuario_id;
    private String nome;
    private String email;
    private String cargo;
    private String telefone;
    private String senha;
    private PerfilUsuario perfil;
    private List<ClienteEntity> clientes;
}
