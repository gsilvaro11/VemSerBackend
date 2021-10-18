package com.dbc.Exercicio.ListaDoisPOO.Exercicio04;

import java.util.Scanner;

/*
Desenvolver um algoritmo que peça três números e informe a posição do menor
número digitado (usar vetor).
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {11,5,3};

        //  int[] numeros = new int[3];

//        for(int i = 0; i < numeros.length; i++){
//            System.out.println("Digite o numero " + i);
//            int numerosDigitados = scanner.nextInt();
//            numeros[i] = numerosDigitados;
//        }
        Programa programa = new Programa(numeros);
        programa.imprime();


    }
}
