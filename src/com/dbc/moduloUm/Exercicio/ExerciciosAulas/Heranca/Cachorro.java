package com.dbc.Exercicio.ExerciciosAulas.Heranca;

public class Cachorro extends Animal{

    Cachorro(){}
    Cachorro(String nome, String raca){
        super(nome, raca);
    }

    public String late(){
        return "O " + getRaca() + " " + getNome() +" latiu";
    }

}
