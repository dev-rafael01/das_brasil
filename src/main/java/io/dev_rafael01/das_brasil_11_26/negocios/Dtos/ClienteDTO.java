package io.dev_rafael01.das_brasil_11_26.negocios.Dtos;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteDTO {

    private Long id;
    private String nome;
    private String sistemaPrimeiro;
    private String sistemaSecundario;
    private String sistemaTerciario;
    private String configCabecote;

    @Builder.Default
    private Set<Long> usuarioIds = Set.of();
}
