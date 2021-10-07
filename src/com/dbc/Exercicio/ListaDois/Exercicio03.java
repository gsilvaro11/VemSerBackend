package com.dbc.Exercicio.ListaDois;

import java.util.Scanner;
/*
Desenvolver um algoritmo que peça nome, altura, idade, peso dos jogadores de
basquete, enquanto o nome do jogador for diferente da palavra SAIR o programa
deverá pedir essas informações, após cadastrados deverá aparecer as seguintes
informações:
*/
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] listaNomeJogador = new String[20];
        float[] listaAlturaJogador = new float[20];

        int aux = 0;
        boolean aulixiar = true;
        while (aulixiar){
            System.out.println("Digite o nome do jogador:  ");
            String nomeJogador = scanner.next();

            System.out.println("Digite a altura do jogador");
            float alturaJogador = scanner.nextFloat();

            listaNomeJogador[aux] = nomeJogador;
            listaAlturaJogador[aux] = alturaJogador;
            aux += 1;

            System.out.println("Deseja sair? digite sair, ou enter para continuar! ");
            String saindo = scanner.next();

            if(saindo.equals("sair")){
                System.out.println("Quantidade jogadores = " + aux);

                float maior = 0;
                for(int i = 0; i < listaAlturaJogador.length; i++){
                    if(listaAlturaJogador[i] > maior){
                        maior = listaAlturaJogador[i];
                    }
                }
                System.out.println("A maior altura é: " + maior);

                aulixiar = false;
            }else {
                continue;
            }
        }
    }
}
