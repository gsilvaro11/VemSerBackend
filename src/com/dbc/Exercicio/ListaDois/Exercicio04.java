package com.dbc.Exercicio.ListaDois;

import java.util.Scanner;

/*
Desenvolver um algoritmo que peça três números e informe a posição do menor
número digitado (usar vetor).
* */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {3,1,8};
    //  int[] numeros = new int[3];

//        for(int i = 0; i < numeros.length; i++){
//            System.out.println("Digite o numero " + i);
//            int numerosDigitados = scanner.nextInt();
//            numeros[i] = numerosDigitados;
//        }
        int numeroMenor = 0;
        for(int i = 0; i < numeros.length; i++){
            int aux = 0;
            for(int y = 0; y < numeros.length; y++){
                if (numeros[i] < numeros[y] || numeros[i] == numeros[y]){
                    aux += 1;
                    if(aux == 3){
                        numeroMenor = numeros[i];
                    }
                }
            }
        }

        for (int i = 0; i < numeros.length; i++){
            if(numeroMenor == numeros[i]){
                System.out.printf("O menor numero é %s e esta na posição %s", numeroMenor, i);
                break;
            }
        }
    }
}
