package com.dbc.pessoaapi.repository;

import com.dbc.pessoaapi.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Integer> {
    List<PessoaEntity> findByNomeContainingIgnoreCase(String nome);
    PessoaEntity findByCpf(String nome);

    @Query("SELECT p FROM PESSOA p " +
            "WHERE p.dataNascimento " +
            "BETWEEN ?1 AND ?2")
    List<PessoaEntity> pessoaPorDataNacismento(LocalDate inicio, LocalDate fim);

    @Query("select p from PESSOA p " +
            "left join p.enderecos e")
    List<PessoaEntity> pessoaComEndereco();



}