package com.dbc.chatkafka.controller;


import com.dbc.chatkafka.dto.MensagemDTO;
import com.dbc.chatkafka.kafka.Producer;
import com.dbc.chatkafka.service.ConsumerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class ProdutorController {
    private final Producer producer;
    private final ConsumerService consumerService;


    @PostMapping("/veiculo-sensor")
    public void inserirAlunoKafka(@RequestBody MensagemDTO mensagemDTO) throws JsonProcessingException {
        producer.sendMessageDTO(mensagemDTO);
    }
}
