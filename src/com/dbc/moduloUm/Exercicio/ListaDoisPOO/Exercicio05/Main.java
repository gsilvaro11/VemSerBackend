package com.dbc.Exercicio.ListaDoisPOO.Exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int[] numeros = new int[20];
        /*for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o numero" + i);
            int numeroDigitado = scanner.nextInt();
            numeros[i] = numeroDigitado;
        }*/

        int[] numeros = {2,5,9,7,8,5};
        Programa programa = new Programa(numeros);
        programa.imprimeInvertido();

    }
}
