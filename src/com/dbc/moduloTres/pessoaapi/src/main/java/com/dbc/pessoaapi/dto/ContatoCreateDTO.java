package com.dbc.pessoaapi.entity;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContatoCreateDTO {
    @NotNull
    @NotBlank
    private String tipoContato;

    @NotNull
    @Size(max = 13)
    private String numero;

    @Size(max = 110)
    private String descricao;

}