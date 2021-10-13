package com.dbc.Exercicio.ExerciciosAulas.Interface;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multipicacao multipicacao = new Multipicacao();
        Divisao divisao = new Divisao();

        //Soma
        System.out.println(soma.calcula(8,8));

        //Subtração
        System.out.println(subtracao.calcula(8,8));

        //Multiplicação
        System.out.println(multipicacao.calcula(8,8));

        //Divisão
        System.out.println(divisao.calcula(8,0));
    }
}
