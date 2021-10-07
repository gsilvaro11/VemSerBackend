package com.dbc.Exercicio.ListaUm;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        String idade = scanner.nextLine();

        System.out.println("Digite sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("Digite seu estado: ");
        String estado = scanner.nextLine();

        System.out.printf("Olá seu nome é %s, você tem %s anos, é da cidade de %s, situada no estado de %s."
                , nome, idade, cidade, estado);
    }
}
