package com.dbc.pessoaapi.controller;

import com.dbc.pessoaapi.dto.ContatoDTO;
import com.dbc.pessoaapi.entity.ContatoCreateDTO;
import com.dbc.pessoaapi.entity.ContatoEntity;
import com.dbc.pessoaapi.exceptions.RegraDeNegocioException;
import com.dbc.pessoaapi.service.ContatoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/contato")
@Validated
@Slf4j
@RequiredArgsConstructor
public class ContatoController {
    private final ContatoService contatoService;

    @GetMapping
    public List<ContatoDTO> list() {
        return contatoService.list();
    }

    @GetMapping("/bynumber")
    public List<ContatoDTO> listByNumero(@RequestParam("numero") String numero){
        return contatoService.listByNumero(numero);
    }

    @PostMapping("/{idPessoa}")
    public ContatoDTO create(@Valid @PathVariable("idPessoa") Integer id,
                             @Valid @RequestBody ContatoCreateDTO contatoCreateDTO) throws RegraDeNegocioException {
        log.info("Criando contato");
        ContatoDTO contatoDTO = contatoService.create(id, contatoCreateDTO);
        log.info("Contato criado com sucesso");
        return contatoDTO;
    }

    @DeleteMapping("/{idContato}")
    public void delete(@PathVariable("idContato") Integer id) throws Exception {
        log.info("Deletando contato");
        contatoService.delete(id);
        log.info("Deletado com sucesso");
    }

    @PutMapping("/{idContato}")
    public ContatoDTO update(@Valid @PathVariable("idContato") Integer id,
                             @Valid @RequestBody ContatoCreateDTO contatoDtoAtulizado) throws Exception {
        log.info("Atualizando contato");
        ContatoDTO contatoDTO = contatoService.update(id, contatoDtoAtulizado);
        log.info("Atualizado com sucesso");
        return contatoDTO;
    }
}