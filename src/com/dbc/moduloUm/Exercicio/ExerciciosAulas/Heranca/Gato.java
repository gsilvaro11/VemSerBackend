package com.dbc.Exercicio.ExerciciosAulas.Heranca;

public class Gato extends Animal{

    Gato(){}
    Gato(String nome, String raca){
        super(nome, raca);
    }

    public String mia(){
        return "O gato " + getNome() + " miou";
    }

}
