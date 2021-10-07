package com.dbc.Exercicio.ListaDois;

import java.util.Scanner;

/*
Desenvolver um vetor que contenha 10 números (não será pedido ao usuário), ao
colocar um determinado número deverá ser buscado no vetor por aquele número,
caso não haja será necessário exibir uma mensagem dizendo que não existe aquele
determinado número digitado.
*/
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {1,3,6,5,8,3,3,8,7,4};

//        System.out.println("Digite um numero: ");
//        int numeroEscolhido = scanner.nextInt();

        int numeroEscolhido = 3;
        int auxiliar = 0;
        for(int valor : numeros){
            if(valor == numeroEscolhido){
                auxiliar += 1;
            }
        }
        String mensagem = auxiliar > 0 ? "Existe o numero no vetor! apareceu " + auxiliar + " vezes." : "Não apareceu.";
        System.out.println(mensagem);
    }
}
