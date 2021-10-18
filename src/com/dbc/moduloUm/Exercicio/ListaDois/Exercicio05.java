package com.dbc.Exercicio.ListaDois;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int[] numeros = new int[20];
        /*for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o numero" + i);
            int numeroDigitado = scanner.nextInt();
            numeros[i] = numeroDigitado;
        }*/

        int[] numeros = {2,5,9,7,8,5};
        System.out.println("Numeros digitados ao contrário!");
        for(int i = numeros.length - 1; i >= 0; i--){
            System.out.println(numeros[i]);
        }
    }
}
