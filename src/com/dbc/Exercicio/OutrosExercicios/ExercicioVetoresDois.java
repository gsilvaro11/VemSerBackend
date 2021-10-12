package com.dbc.Exercicio.OutrosExercicios;

import java.util.Arrays;

public class ExercicioVetoresDois {
    public static void main(String[] args) {
        int[][] numeros = {
                {7,33},
                {22,3}
        };

        int somaColunas = numeros[0][0] + numeros[0][1] + numeros[1][0] + numeros[1][1];
        int somaLinhasUm = Arrays.stream(numeros[0]).sum();
        int somaLinhasDois = Arrays.stream(numeros[1]).sum();
        int subLinhas = somaLinhasUm - somaLinhasDois;

        System.out.printf("Todos os n°: %s\nSoma linha um: %s\nSoma linha dois: %s\nSub linhas: %s",
                somaColunas, somaLinhasUm, somaLinhasDois, subLinhas);
    }
}
