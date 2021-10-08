package com.dbc.Exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioVetoresTres {
    public static <err> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros tu quer preencher?: ");
        int totalNumeros = scanner.nextInt();
        int[] listaNumeros = new int[totalNumeros];

        for(int i = 0; i < listaNumeros.length; i++){
            System.out.printf("Digite o %s ° numero: ", i + 1);
            int numero = scanner.nextInt();
            listaNumeros[i] = numero;
        }

        System.out.println("*********    Valores:    *********");
        for(int valor : listaNumeros){
            System.out.println(valor);
        }

        System.out.printf("Média: %s", Arrays.stream(listaNumeros).sum() / listaNumeros.length);
    }
}
