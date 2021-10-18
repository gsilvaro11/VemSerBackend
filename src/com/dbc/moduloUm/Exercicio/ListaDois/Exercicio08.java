package com.dbc.Exercicio.ListaDois;
/*
Faça um programa que leia uma matriz de 5x4 inteiros contendo as seguintes
informações do tipo inteiro:

a. Primeira coluna: número da matrícula
b. Segunda coluna: media das provas
c. Terceira coluna: média dos trabalhos
d. Quarta coluna: nota final

Elabore um programa que:
a. Leia as 3 primeiras informações de cada aluno
b. Calcule a nota final = (media das provas * 0,6 + media dos trabalhos * 0,4)
c. Imprima a matrícula que obteve a maior nota final
d. Imprima a média das notas finais
*/

public class Exercicio08 {
    public static void main(String[] args) {
        float[][] numeros = {
                {1,8,6,0},
                {2,2,8,0},
                {3,9,5,0},
                {4,3,7,0},
                {5,8,10,0},
        };

        float mediaFinal = 0;
        for (int i = 0; i < numeros.length; i++){
            for (int y = 0; y < numeros.length; y++){
                float media = (float) ((numeros[i][1] * 0.6) + (numeros[i][2] * 0.4));
                numeros[y][3] = media;
                mediaFinal +=  (media/ 5 ) /5 ;
            }
            System.out.printf("Média do %s° aluno = %s\n", (int) numeros[i][0], numeros[i][3]);
        }
        System.out.printf("Média das notas finais = %.2f", mediaFinal);


    }
}
