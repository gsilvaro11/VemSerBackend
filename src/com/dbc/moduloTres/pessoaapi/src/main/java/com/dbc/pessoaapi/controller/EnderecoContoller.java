package com.dbc.pessoaapi.controller;

import com.dbc.pessoaapi.entity.Contato;
import com.dbc.pessoaapi.entity.Endereco;
import com.dbc.pessoaapi.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoContoller {

    @Autowired
    EnderecoService enderecoService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping
    public List<Endereco> list(){return enderecoService.list();}

    @GetMapping("/{idEndereco}/endereco")
    public Endereco listByEndereco(@PathVariable("idEndereco") Integer idEndereco) throws Exception {
        return enderecoService.listByEndereco(idEndereco);
    }

    @GetMapping("/{idPessoa}/pessoa")
    public List<Endereco> listByPessoa(@PathVariable("idPessoa") Integer idPessoa) throws Exception {
        return enderecoService.listByPessoa(idPessoa);
    }

    @PutMapping("/{idEndereco}")
    public Endereco update(@PathVariable("idEndereco") Integer id, @RequestBody Endereco enderecoAtt)
            throws Exception {
        return enderecoService.update(id, enderecoAtt);
    }

    @PostMapping("/{idPessoa}")
    public Endereco create(@PathVariable("idPessoa") Integer id, @RequestBody Endereco enderecoNovo)
    throws Exception{

        return enderecoService.create(id, enderecoNovo);
    }

    @DeleteMapping("/{idEndereco}")
    public void delete(@PathVariable("idEndereco") Integer id) throws Exception {
        enderecoService.delete(id);
    }


}
