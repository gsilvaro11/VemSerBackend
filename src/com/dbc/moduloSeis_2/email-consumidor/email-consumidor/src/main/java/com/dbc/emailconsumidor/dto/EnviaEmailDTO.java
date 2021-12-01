package com.dbc.emailconsumidor.dto;

import lombok.Data;

@Data
public class EnviaEmailDTO {

    private String destinatario;
    private String assunto;
    private String texto;
}
