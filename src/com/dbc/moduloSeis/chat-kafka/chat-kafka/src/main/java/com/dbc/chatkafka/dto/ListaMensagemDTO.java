package com.dbc.chatkafka.dto;

import lombok.Data;

import java.util.List;

@Data
public class ListaMensagemDTO {
    private List<String> usuario;
    private MensagemDTO mensagemDTO;
}
