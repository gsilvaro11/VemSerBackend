package com.dbc.Exercicio.ListaDoisPOO.Exercicio08;
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
public class Main {
    public static void main(String[] args) {
        float[][] numeros = {
                {1,8,6,0},
                {2,2,8,0},
                {3,9,5,0},
                {4,3,7,0},
                {5,8,10,0},
        };

        Programa programa = new Programa(numeros);
        programa.media();

    }
}
