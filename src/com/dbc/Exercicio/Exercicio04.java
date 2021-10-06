package com.dbc.Exercicio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] esdadosCidade;
        esdadosCidade = new String[][]{{"RS", "POA", "VIA"}, {"SP", "SP", "SP"}, {"RJ", "RJ", "RJ"}};

        System.out.println("Estados cadastrados:");
        for(int i = 0; i < esdadosCidade.length; i++){
            System.out.printf(esdadosCidade[i][0] + "\n");
        }

//        System.out.println("Escolha um estado: ");
//        String estadoEscolhido = scanner.nextLine();

        String teste = "RS";
//        for (int i = 0; i < esdadosCidade.length; i++){
//            if (teste == esdadosCidade[i]) {
//                System.out.println("ok");
//            }
//
//        }

    }
}
