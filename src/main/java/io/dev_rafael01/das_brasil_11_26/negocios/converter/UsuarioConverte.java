package io.dev_rafael01.das_brasil_11_26.negocios.converter;

import io.dev_rafael01.das_brasil_11_26.infraestrutura.entity.UsuarioEntity;
import io.dev_rafael01.das_brasil_11_26.negocios.Dtos.UsuarioDTO;

public class UsuarioConverte {

    public UsuarioEntity paraUsuarioDTO(UsuarioDTO usuarioDTO){
        return UsuarioEntity.builder()
                .nome(usuarioDTO.getNome())
                .email(usuarioDTO.getEmail())
                .senha(usuarioDTO.getSenha())
                .telefone(usuarioDTO.getTelefone())
                .cargo(usuarioDTO.getCargo())
                .perfil(usuarioDTO.getPerfil())
                .build();
    }

}
