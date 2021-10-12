package com.dbc.Exercicio.ListaUmPOO.Exercicio01;

public class Exercicio01 {
    private String nome;
    private int idade;
    private String cidade;
    private String estado;

    Exercicio01(){}
    Exercicio01(String nome, int idade, String cidade, String estado){
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void imprimeUsuario(){
        System.out.printf("Olá seu nome é %s, você tem %s anos, é de %s, situada no estado de %s."
                ,this.nome,this.idade,this.cidade,this.estado);
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getCidade(){
        return this.cidade;
    }

    public String getEstado(){
        return this.estado;
    }



}
