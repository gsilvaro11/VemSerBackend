package com.dbc.Exercicio.ListaDoisPOO.Exercicio03;

import java.util.Locale;
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
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogadores jogador = new Jogadores();


        while (true){
            System.out.println("Digite o nome do jogador:  ");
            String nomeJogador = scanner.next();
            jogador.setNomeJogadores(nomeJogador);

            System.out.println("Digite a altura do jogador");
            Float alturaJogador = scanner.nextFloat();
            jogador.setAlturaJogadores(alturaJogador);

            System.out.println("Digite a idade do jogador: ");
            Integer idadeJogador = scanner.nextInt();
            jogador.setIdadeJogadores(idadeJogador);

            System.out.println("Digite o peso do jogador: ");
            Float pesoJogador = scanner.nextFloat();
            jogador.setPesoJogadores(pesoJogador);

            System.out.println("Deseja sair? [S/N]");
            String verifica = scanner.next();

            if(verifica.toLowerCase(Locale.ROOT).equals("s")){
                jogador.imprime();
                break;
            }


        }



    }


}
