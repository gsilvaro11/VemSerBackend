package com.dbc.pessoaapi.service;

import com.dbc.pessoaapi.dto.*;
import com.dbc.pessoaapi.entity.PessoaEntity;
import com.dbc.pessoaapi.exceptions.RegraDeNegocioException;
import com.dbc.pessoaapi.repository.PessoaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PessoaService {
    private final PessoaRepository pessoaRepository;
    private final ObjectMapper objectMapper;


    public PessoaDTO create(PessoaCreateDTO pessoaCreateDTO) throws Exception {
        PessoaEntity pessoaEntity = objectMapper.convertValue(pessoaCreateDTO, PessoaEntity.class);
        PessoaEntity pessoaCriada = pessoaRepository.save(pessoaEntity);
        PessoaDTO pessoaDTO = objectMapper.convertValue(pessoaCriada, PessoaDTO.class);

        return pessoaDTO;
    }

    public List<PessoaDTO> list(){
        return pessoaRepository.findAll().stream()
                .map(pessoa -> objectMapper.convertValue(pessoa, PessoaDTO.class))
                .collect(Collectors.toList());
    }

    public PessoaDTO update(Integer id, PessoaCreateDTO pessoaCreateDTO) throws Exception {
        findById(id);
        PessoaEntity entity = objectMapper.convertValue(pessoaCreateDTO, PessoaEntity.class);
        entity.setIdPessoa(id);
        PessoaEntity atualizado = pessoaRepository.save(entity);
        PessoaDTO dto = objectMapper.convertValue(atualizado, PessoaDTO.class);
        return dto;
    }

    public PessoaDTO findById(Integer id) throws RegraDeNegocioException{
        PessoaEntity entity = pessoaRepository.findById(id)
                .orElseThrow(() -> new RegraDeNegocioException("pessoa não encontrada"));
        PessoaDTO dto = objectMapper.convertValue(entity, PessoaDTO.class);
        return dto;
    }

    public void delete(Integer id) throws Exception {
        PessoaDTO pessoaDeletada = findById(id);
        PessoaEntity entity = objectMapper.convertValue(pessoaDeletada, PessoaEntity.class);
        pessoaRepository.delete(entity);

    }

    public List<PessoaContatoDTO> getByContato(){
        return pessoaRepository.findAll().stream()
                .map(x -> {
                    PessoaContatoDTO pessoaContatoDTO = objectMapper.convertValue(x, PessoaContatoDTO.class);
                    pessoaContatoDTO.setListaContato(x.getContatos().stream()
                            .map(contato -> {
                                ContatoDTO contatoDTO = objectMapper.convertValue(contato, ContatoDTO.class);
                                return contatoDTO;
                            })
                            .collect(Collectors.toList()));
                    return pessoaContatoDTO;
                })
                .collect(Collectors.toList());
    }

    public List<PessoaEnderecoDTO> getByEndereco(){
        return pessoaRepository.findAll().stream()
                .map(x -> {
                    PessoaEnderecoDTO pessoaEnderecoDTO = objectMapper.convertValue(x, PessoaEnderecoDTO.class);
                    pessoaEnderecoDTO.setListaDeEnderecos(x.getEnderecos().stream()
                            .map(endereco -> {
                                EnderecoDTO enderecoDTO = objectMapper.convertValue(endereco, EnderecoDTO.class);
                                return enderecoDTO;
                            })
                            .collect(Collectors.toList()));
                    return pessoaEnderecoDTO;
                })
                .collect(Collectors.toList());
    }


    public PessoaDTO listById(Integer idPessoa) throws RegraDeNegocioException {
        PessoaEntity entity = pessoaRepository.findById(idPessoa)
                .orElseThrow(() -> new RegraDeNegocioException("Pessoa não encontrada"));
        PessoaDTO dto = objectMapper.convertValue(entity, PessoaDTO.class);
        return dto;
    }
}
