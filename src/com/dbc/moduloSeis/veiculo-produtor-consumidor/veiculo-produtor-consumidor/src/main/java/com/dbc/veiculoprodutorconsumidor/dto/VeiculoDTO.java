package com.dbc.veiculoprodutorconsumidor.dto;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDateTime;


@Data
@Document(collection = "sensor")
public class VeiculoDTO {
    private LocalDateTime dataLeitura;
    private Double velocidade;
    private Integer rotacao;
    private Boolean sensorFrenagem;
}
