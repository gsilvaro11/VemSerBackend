package com.dbc.Aulas.Aula03.Exericio;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String whatsapp;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){return nome;}

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getSobrenome(){return sobrenome;}

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){return idade;}

    public void setWhatsapp(String whatsapp){
        this.whatsapp = whatsapp;
    }
    public String getWhatsapp() {return whatsapp;}

    public void conversar(Pessoa pessoa){
        System.out.printf("%s conversou com o(a) %s\n", nome, pessoa.getNome());
    }

    public String retonarNomeCompleto(){
        return nome + " " + sobrenome;
    }

    public boolean ehMaiorDeIdade(){
        return idade >= 18;
    }

    public void mandarWhatsApp(Pessoa pessoa, String mensagem){
        System.out.printf("%s enviou a mensagem '%s' para a %s", nome, mensagem, pessoa.getNome());
    }

}
