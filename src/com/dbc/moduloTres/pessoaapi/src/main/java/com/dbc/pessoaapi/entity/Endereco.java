package com.dbc.pessoaapi.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Endereco {
    private Integer idEndereco;
    private Integer idPessoa;

    @NotNull(message = "Não pode ser nulo")
    @NotBlank(message = "Não pode estar em branco")
    private String tipo;

    @Size(max = 250)
    private String logradouro;

    @NotNull(message = "Não pode ser nulo")
    private Integer numero;

    @NotNull(message = "Não pode ser nulo")
    @NotBlank(message = "Não pode estar em branco")
    private String complemento;

    @NotNull(message = "Não pode ser nulo")
    @NotBlank(message = "Não pode estar em branco")
    @Size(max = 8, min = 8)
    private String cep;

    @NotNull(message = "Não pode ser nulo")
    @NotBlank(message = "Não pode estar em branco")
    @Size(max = 250)
    private String cidade;

    @NotNull(message = "Não pode ser nulo")
    private String estado;

    @NotNull(message = "Não pode ser nulo")
    private String pais;

    public Endereco() {
    }

    public Endereco(Integer idEndereco, Integer idPessoa, String tipo, String logradouro, Integer numero, String complemento, String cep, String cidade, String estado, String pais) {
        this.idEndereco = idEndereco;
        this.idPessoa = idPessoa;
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
