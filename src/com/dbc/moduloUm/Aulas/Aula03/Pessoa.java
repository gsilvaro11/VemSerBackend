package com.dbc.Aulas.Aula03;

public class Pessoa {
    String nome;
    int idade;
    Telefone telefone;

    public Pessoa(){}

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    public void conversar(Pessoa pessoa, String mensagem){
        System.out.println(nome + " conversou " + mensagem + pessoa.nome);
    }

    public int diferencaIdade(Pessoa pessoa){
        int diferenca = this.idade - pessoa.idade;
        return diferenca;
    }
}
