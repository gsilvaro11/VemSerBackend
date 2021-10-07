package com.dbc.Aulas.Aula03.Exericio;

public class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    String whatsapp;

    public void conversar(Pessoa pessoa){
        System.out.printf("%s conversou com o(a) %s\n", nome, pessoa.nome);
    }

    public String retonarNomeCompleto(){
        return nome + " " + sobrenome;
    }

    public boolean ehMaiorDeIdade(){
        boolean retorna = idade > 18 ? true : false;
        return retorna;
    }

    public void mandarWhatsApp(Pessoa pessoa, String mensagem){
        System.out.printf("%s enviou a mensagem '%s' para a %s", nome, mensagem, pessoa.nome);
    }

}
