package com.dbc.pessoaapi.entity;

import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Endereco_Pessoa")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ENDERECO_SEQ")
    @SequenceGenerator(name = "ENDERECO_SEQ", sequenceName = "seq_endereco_contato", allocationSize = 1)
    @Column(name = "id_endereco")
    private Integer idEndereco;
//    private Integer idPessoa;


    @Column(name = "tipo")
    private Integer tipo;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "numero")
    private Integer numero;


    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;

}
