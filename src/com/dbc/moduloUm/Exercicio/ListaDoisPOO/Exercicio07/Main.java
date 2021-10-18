package com.dbc.Exercicio.ListaDoisPOO.Exercicio07;
/*
Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.
*/
public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {2,5,6,11},
                {12,10,22,2},
                {2,13,8,72},
                {6,4,9,90}
        };

        Programa programa = new Programa(matriz);
        programa.verificaNumero();

    }
}
