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
public class EnderecoDTO {
    private Integer idEndereco;
    private Integer idPessoa;

    @NotNull(message = "Não pode ser nulo")
    @NotBlank(message = "Não pode estar em branco")
    private String tipo;

    @Size(max = 250)
    private String logradouro;

    @NotNull(message = "Não pode ser nulo")
    private Integer numero;

    @NotNull(message = "Não pode ser nulo")
    @NotBlank(message = "Não pode estar em branco")
    private String complemento;

//    @NotNull(message = "Não pode ser nulo")
//    @NotBlank(message = "Não pode estar em branco")
//    @Size(max = 8, min = 8)
//    private String cep;

    @NotNull(message = "Não pode ser nulo")
    @NotBlank(message = "Não pode estar em branco")
    @Size(max = 250)
    private String cidade;

    @NotNull(message = "Não pode ser nulo")
    private String estado;

    @NotNull(message = "Não pode ser nulo")
    private String pais;


}
