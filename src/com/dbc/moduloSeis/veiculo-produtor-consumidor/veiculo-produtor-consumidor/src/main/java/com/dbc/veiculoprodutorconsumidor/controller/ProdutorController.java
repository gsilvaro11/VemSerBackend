package com.dbc.veiculoprodutorconsumidor.controller;


import com.dbc.veiculoprodutorconsumidor.dto.VeiculoDTO;
import com.dbc.veiculoprodutorconsumidor.kafka.Producer;
import com.dbc.veiculoprodutorconsumidor.service.ConsumerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class ProdutorController {
    private final Producer producer;
    private final ConsumerService consumerService;

    @GetMapping
    public List<VeiculoDTO> listar(){
        return consumerService.list();
    }

    @PostMapping("/veiculo-sensor")
    public void inserirAlunoKafka(@RequestBody VeiculoDTO veiculoDTO) throws JsonProcessingException {
        producer.sendMessageDTO(veiculoDTO);
    }
}
