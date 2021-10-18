package com.dbc.Exercicio.ListaUmPOO.Exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tradutor tradutorPalavra = new Tradutor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a palavra");
        String palavra = scanner.next();

        tradutorPalavra.tradutor("love");
    }
}
