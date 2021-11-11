package com.dbc.pessoaapi.repository;



import com.dbc.pessoaapi.entity.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Integer> {

    @Query("select e from Endereco_Pessoa e where e.pais = ?1 ")
    List<EnderecoEntity> enderecoPorPais(String pais);

    @Query("select ep from Endereco_Pessoa ep " +
            "join ep.pessoas p where p.idPessoa = ?1")
    List<EnderecoEntity> endercoPorPessoa(Integer idPessoa);

    @Query(value = "select * from VEM_SER.ENDERECO_PESSOA ep " +
            "where ep.PAIS = ?1 or ep.CIDADE = ?1 ", nativeQuery = true)
    List<EnderecoEntity> enderecoCidadePais(String paisCidade);

}