package com.dbc.Exercicio.ListaDois;

import java.util.Scanner;

/*
Isso lembrará uma brincadeira de colégio...Uma pessoa escolhe um número e pede
para outro adivinhar, faça um programa que tenha a mesma ideia, você informará um
número e quando alguém for tentar adivinhá-lo o programa deverá informar se
acertou o número ou se errou, se errou o programa deverá apresentar uma das
seguintes frases: O número a ser encontrado é menor do que você digitou ou O
número a ser encontrado é maior do que você digitou.

*/
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numeroMaquina = 2;

        boolean auxiliar = true;
        while (auxiliar){
            try {
                while (true){
                    System.out.println("Digite um numero:");
                    int numeroEscolhido = scanner.nextInt();
                    try {
                        if(numeroEscolhido == numeroMaquina){
                            System.out.println("Parabéns, você acertou!");
                            auxiliar = false;
                            break;
                        }else {
                            System.err.println("Você errou!!!");
                            String aux = numeroEscolhido > numeroMaquina ? "Seu numero é maior!" : "Seu numero é menor";
                            System.out.println(aux);
                        }
                    }catch (Exception e){
                        System.err.println("ERRO, tente novamente!");
                    }
                }
            }catch (Exception e){
                System.err.println("ERRO, tente novamente!");

            }
        }
    }
}
