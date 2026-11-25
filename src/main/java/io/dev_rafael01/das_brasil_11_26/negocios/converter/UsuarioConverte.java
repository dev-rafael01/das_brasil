package io.dev_rafael01.das_brasil_11_26.negocios.converter;

import io.dev_rafael01.das_brasil_11_26.infraestrutura.entity.ClienteEntity;
import io.dev_rafael01.das_brasil_11_26.infraestrutura.entity.UsuarioEntity;
import io.dev_rafael01.das_brasil_11_26.negocios.Dtos.ClienteDTO;
import io.dev_rafael01.das_brasil_11_26.negocios.Dtos.UsuarioCriacaoDTO;
import io.dev_rafael01.das_brasil_11_26.negocios.Dtos.UsuarioDTO;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UsuarioConverte {

    public UsuarioEntity paraUsuarioEntity(
            UsuarioCriacaoDTO dto,
            String senhaCriptografada
    ) {
        return UsuarioEntity.builder()
                .nome(dto.getNome())
                .email(dto.getEmail())
                .cargo(dto.getCargo())
                .telefone(dto.getTelefone())
                .senha(senhaCriptografada)
                .perfil(dto.getPerfil())
                .clientes(new HashSet<>())
                .build();
    }

    public UsuarioDTO paraUsuarioDTO(UsuarioEntity usuario) {
        Set<Long> clienteIds = usuario.getClientes() == null
                ? Set.of()
                : usuario.getClientes().stream()
                .map(ClienteEntity::getId)
                .collect(Collectors.toSet());

        return UsuarioDTO.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .email(usuario.getEmail())
                .cargo(usuario.getCargo())
                .telefone(usuario.getTelefone())
                .perfil(usuario.getPerfil())
                .clienteIds(clienteIds)
                .build();
    }

    public ClienteEntity paraClienteEntity(ClienteDTO dto) {
        return ClienteEntity.builder()
                .id(dto.getId())
                .nome(dto.getNome())
                .sistemaPrimeiro(dto.getSistemaPrimeiro())
                .sistemaSecundario(dto.getSistemaSecundario())
                .sistemaTerciario(dto.getSistemaTerciario())
                .configCabecote(dto.getConfigCabecote())
                .usuarios(new HashSet<>())
                .build();
    }

    public ClienteDTO paraClienteDTO(ClienteEntity cliente) {
        Set<Long> usuarioIds = cliente.getUsuarios() == null
                ? Set.of()
                : cliente.getUsuarios().stream()
                .map(UsuarioEntity::getId)
                .collect(Collectors.toSet());

        return ClienteDTO.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .sistemaPrimeiro(cliente.getSistemaPrimeiro())
                .sistemaSecundario(cliente.getSistemaSecundario())
                .sistemaTerciario(cliente.getSistemaTerciario())
                .configCabecote(cliente.getConfigCabecote())
                .usuarioIds(usuarioIds)
                .build();
    }
}