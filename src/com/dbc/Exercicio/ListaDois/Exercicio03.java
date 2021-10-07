package com.dbc.Exercicio.ListaDois;

import java.util.Scanner;
/*
Desenvolver um algoritmo que peça nome, altura, idade, peso dos jogadores de
basquete, enquanto o nome do jogador for diferente da palavra SAIR o programa
deverá pedir essas informações, após cadastrados deverá aparecer as seguintes
informações:

Quantidade de jogadores cadastrados;
Altura do maior Jogador;
Jogador mais velho;
Jogador mais pesado;
Média das alturas jogadores.
*/
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] listaNomeJogador = new String[20];
        float[] listaAlturaJogador = new float[20];
        Integer[] listaIdadeJogador = new Integer[20];
        Float[] listaPesoJogador = new Float[20];

        int aux = 0;
        Integer jogadorMaisVelho = 0;
        Float jogadorMaisPesado = 0f;
        Float somaAltura = 0f;

        boolean aulixiar = true;
        while (aulixiar){
            System.out.println("Digite o nome do jogador:  ");
            String nomeJogador = scanner.next();

            System.out.println("Digite a altura do jogador");
            float alturaJogador = scanner.nextFloat();

            System.out.println("Digite a idade do jogador: ");
            Integer idadeJogador = scanner.nextInt();

            System.out.println("Digite o peso do jogador: ");
            Float pesoJogador = scanner.nextFloat();


            listaNomeJogador[aux] = nomeJogador;
            listaAlturaJogador[aux] = alturaJogador;
            listaIdadeJogador[aux] = idadeJogador;
            listaPesoJogador[aux] = pesoJogador;
            aux += 1;

            Integer verificaIdade = idadeJogador > jogadorMaisVelho ? jogadorMaisVelho = idadeJogador : jogadorMaisVelho;
            Float verificaPeso = pesoJogador > jogadorMaisPesado ? jogadorMaisPesado = pesoJogador : jogadorMaisPesado;
            somaAltura += alturaJogador;

            System.out.println("Deseja sair? digite 'sair', ou 'ok' para continuar! ");
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
                System.out.println("O jogador mais velho é: " + jogadorMaisVelho);
                System.out.println("O mais pesado é: " + jogadorMaisPesado);
                System.out.println("A média de altura é: " + somaAltura / aux);

                aulixiar = false;
            }else {
                continue;
            }
        }
    }
}
