package com.dbc.Exercicio.ListaUm;

public class Exercicio02 {
    public static void main(String[] args){
        float nota1 = 10;
        float nota2 = 10;
        float nota3 = 10;
        float nota4 = 10;
        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7){
            System.out.println("Aprovado!");
        }else if(media >= 5.1 && media <= 6.9){
            System.out.println("Em exame!");
        }else {
            System.out.println("Reprovado!");
        }
        System.out.println("Média: " + media);

    }
}
