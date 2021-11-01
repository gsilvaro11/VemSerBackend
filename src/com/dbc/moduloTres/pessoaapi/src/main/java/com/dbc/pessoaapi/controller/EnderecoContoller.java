package com.dbc.pessoaapi.controller;


import com.dbc.pessoaapi.dto.EnderecoCreateDTO;
import com.dbc.pessoaapi.dto.EnderecoDTO;

import com.dbc.pessoaapi.exceptions.RegraDeNegocioException;
import com.dbc.pessoaapi.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/endereco")
@Validated
@Slf4j
@RequiredArgsConstructor
public class EnderecoContoller {
    private final EnderecoService enderecoService;

    @GetMapping
    public List<EnderecoDTO> list(){return enderecoService.list();}

    @GetMapping("/{idEndereco}/endereco")
    public EnderecoDTO listByEndereco(@PathVariable("idEndereco") Integer idEndereco) throws Exception {
        return enderecoService.listByEndereco(idEndereco);
    }

    @GetMapping("/{idPessoa}/pessoa")
    public List<EnderecoDTO> listByPessoa(@PathVariable("idPessoa") Integer idPessoa) throws Exception {
        return enderecoService.listByPessoa(idPessoa);
    }

    @PutMapping("/{idEndereco}")
    public EnderecoDTO update(@Valid @PathVariable("idEndereco") Integer id,
                              @Valid @RequestBody EnderecoCreateDTO enderecoCreateDTO)
            throws Exception {
        log.info("Atualizando pessoa");
        EnderecoDTO enderecoDTO = enderecoService.update(id, enderecoCreateDTO);
        log.info("Atualizado com sucesso");
        return enderecoDTO;
    }

    @PostMapping("/{idPessoa}")
    public EnderecoDTO create(@Valid @PathVariable("idPessoa") Integer id,
                              @Valid @RequestBody EnderecoCreateDTO enderecoCreateDTO)
                                throws RegraDeNegocioException {
        log.info("Criando pessoa");
        EnderecoDTO enderecoDTO = enderecoService.create(id, enderecoCreateDTO);
        log.info("Criado com sucesso");
        return enderecoDTO;
    }

    @DeleteMapping("/{idEndereco}")
    public void delete(@PathVariable("idEndereco") Integer id) throws Exception {
        log.info("Deletando pessoa");
        enderecoService.delete(id);
        log.info("Deletado com sucesso");
    }
}