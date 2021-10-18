package com.dbc.Exercicio.ListaDoisPOO.Exercicio06;

import java.util.Scanner;

/*
Desenvolver um vetor que contenha 10 números (não será pedido ao usuário), ao
colocar um determinado número deverá ser buscado no vetor por aquele número,
caso não haja será necessário exibir uma mensagem dizendo que não existe aquele
determinado número digitado.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {1,3,6,5,8,3,3,8,7,4};

        System.out.println("Digite um numero: ");
        int numeroEscolhido = scanner.nextInt();

        Programa programa = new Programa(numeros);
        programa.verificaNumero(numeroEscolhido);

    }
}
