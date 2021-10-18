package com.dbc.Exercicio.ExerciciosAulas.Heranca;

public abstract class Animal {
    private String nome;
    private String raca;

    Animal(){}
    Animal(String nome, String raca){
        this.nome = nome;
        this.raca = raca;

    }

    public void caminha(){
        System.out.printf("O %s caminha", nome);
    }

    public String getNome(){
        return this.nome;
    }

    public String getRaca(){
        return this.raca;
    }

}
