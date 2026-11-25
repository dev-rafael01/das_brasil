package io.dev_rafael01.das_brasil_11_26.negocios.converter;


import io.dev_rafael01.das_brasil_11_26.infraestrutura.entity.ClienteEntity;
import io.dev_rafael01.das_brasil_11_26.infraestrutura.entity.UsuarioEntity;
import io.dev_rafael01.das_brasil_11_26.negocios.Dtos.ClienteDTO;
import io.dev_rafael01.das_brasil_11_26.negocios.Dtos.UsuarioDTO;
import org.springframework.stereotype.Component;


@Component
public class UsuarioConverte {

    //Convertendo de Entity para Dtos

    UsuarioEntity paraUsuarioDTO (UsuarioDTO usuarioDTO){
        return UsuarioEntity.builder()
                .nome(usuarioDTO.getNome())
                .senha(usuarioDTO.getSenha())
                .email(usuarioDTO.getEmail())
                .telefone(usuarioDTO.getTelefone())
                .cargo(usuarioDTO.getCargo())
                .perfil(usuarioDTO.getPerfil())
                .build();
    }


    ClienteEntity paraClienteDTO(ClienteDTO clienteDTO){
        return ClienteEntity.builder()
                .id(clienteDTO.getId())
                .nome(clienteDTO.getNome())
                .sistemaPrimeiro(clienteDTO.getSistemaPrimeiro())
                .sistemaTerciario(clienteDTO.getSistemaTerciario())
                .sistemaTerciario(clienteDTO.getSistemaTerciario())
                .build();
    }

    // Convertendo de DTO para Entity

    public UsuarioDTO paraUsuarioEntity (UsuarioEntity usuarioEntity){
        return UsuarioDTO.builder()
                .nome(usuarioEntity.getNome())
                .senha(usuarioEntity.getSenha())
                .email(usuarioEntity.getEmail())
                .telefone(usuarioEntity.getTelefone())
                .cargo(usuarioEntity.getCargo())
                .perfil(usuarioEntity.getPerfil())
                .build();
    }

    public ClienteDTO paraClienteEntity (ClienteEntity clienteEntity){
        return ClienteDTO.builder()
                .nome(clienteEntity.getNome())
                .sistemaPrimeiro(clienteEntity.getSistemaPrimeiro())
                .sistemaSecundario(clienteEntity.getSistemaSecundario())
                .sistemaTerciario(clienteEntity.getSistemaTerciario())
                .build();
    }




}