package com.dbc.Exercicio.ListaDois;
/*
Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.
*/
public class Exercicio07 {
    public static void main(String[] args) {
        int[][] matriz = {
                {2,5,6,11},
                {12,10,22,2},
                {2,13,8,72},
                {6,4,9,90}
        };

        int auxiliar = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int y = 0; y < matriz.length; y++){
                int verifica = matriz[i][y] > 10 ? auxiliar += 1 : auxiliar;
            }
        }
        System.out.printf("Existem %s numeros maiores que 10 no vetor", auxiliar);

    }
}
