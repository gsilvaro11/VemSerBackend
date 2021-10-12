package com.dbc.Exercicio.ListaUmPOO.Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua cidade: ");
        String cidade = scanner.next();

        System.out.println("Digite seu estado: ");
        String estado = scanner.next();

        Exercicio01 usuario = new Exercicio01(nome, idade, cidade, estado);

        usuario.imprimeUsuario();

    }
}
