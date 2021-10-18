package com.dbc.Exercicio.ListaDoisPOO.Exercicio05;

public class Programa {
    private int[] vetor;

    Programa(int[] vetor){ this.vetor = vetor; }

    public void imprimeInvertido(){
        for(int i = vetor.length - 1; i >= 0; i--){
            System.out.println(vetor[i]);
        }
    }

}
