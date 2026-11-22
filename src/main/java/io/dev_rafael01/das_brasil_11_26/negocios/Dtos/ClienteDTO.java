package io.dev_rafael01.das_brasil_11_26.negocios.Dtos;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteDTO {

    private Long cliente_id;
    private String nome;
    private String sistemaPrimeira;
    private String sistemaSegundario;
    private String sistemaTerciario;
    private String confiCabecote;
}
