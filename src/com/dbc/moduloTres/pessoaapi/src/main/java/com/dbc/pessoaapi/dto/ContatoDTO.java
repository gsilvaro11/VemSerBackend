package com.dbc.pessoaapi.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContatoDTO {
    private Integer idContato;
    private Integer idPessoa;

    @NotNull
    @NotBlank
    private String tipoContato;

//    @NotNull
//    @Size(max = 13)
//    private String numero;

    @Size(max = 110)
    private String descricao;

}