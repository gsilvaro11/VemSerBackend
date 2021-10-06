package com.dbc.Exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lista[] = new String[] {"CACHORRO", "DOG", "TEMPO", "TIME",
                "AMOR", "LOVE", "CIDADE", "CITY", "FELIZ", "HAPPY"};

        System.out.println("Digite o que gostaria de traduzir: ");
        String digitado = scanner.nextLine();

        for(int i = 0; i < lista.length; i++){
            if(digitado.toUpperCase().equals(lista[i])){
                int teste = i % 2 == 0 ? i + 1 : i - 1;
                System.out.printf("Palavra digitada: %s\nTradução: %s", digitado.toUpperCase(), lista[teste]);
                break;
            }else if(i + 1 == lista.length){
                System.err.println("Palavra não encontrada");
            }else {
                continue;
            }
        }
    }
}
