package com.dbc.pessoaapi.service;


import com.dbc.pessoaapi.entity.Endereco;
import com.dbc.pessoaapi.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    public Endereco create(Integer id, Endereco endereco) {
        endereco.setIdPessoa(id);
        return enderecoRepository.create(endereco);
    }

    public List<Endereco> list(){return enderecoRepository.list();}

    public Endereco listByEndereco(Integer id) throws Exception{
        return enderecoRepository.listByEndereco(id);
    }

    public List<Endereco> listByPessoa(Integer idPessoa) throws Exception{
        return enderecoRepository.listByPessoa(idPessoa);
    }

    public Endereco update(Integer idEndeco, Endereco enderecoAtt) throws Exception{
        return enderecoRepository.update(idEndeco, enderecoAtt);
    }

    public void delete(Integer id) throws Exception {
        enderecoRepository.delete(id);
    }

}
