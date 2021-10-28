package com.dbc.pessoaapi.controller;

import com.dbc.pessoaapi.entity.Contato;
import com.dbc.pessoaapi.exceptions.RegraDeNegocioException;
import com.dbc.pessoaapi.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/contato")
@Validated
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @GetMapping("/teste")
    public String teste(){
        return "testando contato";
    }

    @GetMapping
    public List<Contato> list() {
        return contatoService.list();
    }

    @GetMapping("/bynumber")
    public List<Contato> listByNumero(@RequestParam("numero") String numero){
        return contatoService.listByNumero(numero);
    }

    @PostMapping("/{idPessoa}")
    public Contato create(@Valid @PathVariable("idPessoa") Integer id, @Valid @RequestBody Contato contato) throws RegraDeNegocioException {
        return contatoService.create(id, contato);
    }

    @DeleteMapping("/{idContato}")
    public void delete(@PathVariable("idContato") Integer id) throws Exception {
        contatoService.delete(id);
    }

    @PutMapping("/{idContato}")
    public Contato update(@Valid @PathVariable("idContato") Integer id, @Valid @RequestBody Contato contatoAtualizar) throws Exception {
        return contatoService.update(id, contatoAtualizar);
    }

}
