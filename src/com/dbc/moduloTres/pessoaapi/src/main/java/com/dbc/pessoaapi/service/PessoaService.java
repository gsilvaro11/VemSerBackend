package com.dbc.pessoaapi.service;

import com.dbc.pessoaapi.dto.PessoaCreateDTO;
import com.dbc.pessoaapi.dto.PessoaDTO;
import com.dbc.pessoaapi.entity.PessoaEntity;
import com.dbc.pessoaapi.exceptions.RegraDeNegocioException;
import com.dbc.pessoaapi.repository.PessoaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
        PessoaEntity pessoaCriada = pessoaRepository.create(pessoaEntity);
        PessoaDTO pessoaDTO = objectMapper.convertValue(pessoaCriada, PessoaDTO.class);

        return pessoaDTO;
    }

    public List<PessoaDTO> list(){
        return pessoaRepository.list().stream()
                .map(pessoa -> objectMapper.convertValue(pessoa, PessoaDTO.class))
                .collect(Collectors.toList());
    }

    public PessoaDTO update(Integer id, PessoaCreateDTO pessoaCreateDTO) throws Exception {
        PessoaEntity entity = objectMapper.convertValue(pessoaCreateDTO, PessoaEntity.class);
        PessoaEntity atualizado = pessoaRepository.update(id, entity);
        PessoaDTO dto = objectMapper.convertValue(atualizado, PessoaDTO.class);
        return dto;
    }

    public void delete(Integer id) throws Exception {
         pessoaRepository.delete(id);
    }

    public List<PessoaDTO> listByName(String nome) {
        return pessoaRepository.listByName(nome).stream()
                .map(x -> objectMapper.convertValue(x, PessoaDTO.class))
                .collect(Collectors.toList());
    }

    public PessoaDTO listById(Integer idPessoa) throws RegraDeNegocioException {
        PessoaEntity entity = pessoaRepository.listById(idPessoa);
        PessoaDTO dto = objectMapper.convertValue(entity, PessoaDTO.class);
        return dto;
    }
}
