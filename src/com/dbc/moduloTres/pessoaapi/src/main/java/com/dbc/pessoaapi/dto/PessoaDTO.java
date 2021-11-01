package com.dbc.pessoaapi.dto;

import lombok.*;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PessoaDTO {
    private Integer idPessoa;

    @NotNull(message = "Não pode ser nulo")
    @NotBlank(message = "Não pode estar em branco")
    private String nome;

    @NotNull(message = "Não pode ser nulo")
    @NotBlank(message = "Não pode estar em branco")
    private String email;

    @NotNull(message = "Não pode ser nulo")
    @Past()
    private LocalDate dataNascimento;

//    @NotNull(message = "Não pode ser nulo")
//    @NotEmpty(message = "Não pode estar em branco")
//    @Size(max = 11, min = 11)
//    private String cpf;
}
