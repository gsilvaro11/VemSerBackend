package com.dbc.Exercicio.ListaUm;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] estados = {"Rio Grande do Sul", "São Paulo", "Rio Janeiro",};

        for (int i = 0; i < estados.length; i++) {
            System.out.printf("%s   %s\n", estados[i], i + 1);        }


        System.out.println("Digite o index do estado");
        int indexEscolhido = scanner.nextInt();

        switch (indexEscolhido){
            case 1:
                System.out.println("p - Porto Alegre, v - Viamão");
                break;
            case 2:
                System.out.println("s - São Paulo, sa - Bauru");
                break;

            case 3:
                System.out.println("r - Rio de Janeiro, n - Niteroi");
                break;

            default:
                System.out.println("Opção inválida");
        }

        char escolhaCidade = scanner.next().charAt(0);
        switch (escolhaCidade){
            case 'p':
                System.out.println("Porto Alegre\nPopulaçao: 1milhão\nIDH: 7\nPonto Turistico: Mercadao");
                break;
            case 'v':
                System.out.println("Viamão\nPopulaçao: 500mil\nIDH: 7\nPonto Turistico: Santa Cicilia");
                break;
            case 's':
                System.out.println("São Paulo\nPopulaçao: 10milhões\nIDH: 8\nPonto Turistico: Augusta");
                break;
            case 'b':
                System.out.println("Bauru\nPopulaçao: 3milhão\nIDH: 8\nPonto Turistico: Estadio");
                break;
            case 'r':
                System.out.println("Rio de Janeiro \nPopulaçao: 7milhão\nIDH: 7\n:Ponto Turistico: Cristo");
                break;
            case 'n':
                System.out.println("Niteroi \nPopulaçao: 1milhão\nIDH: 7\nPonto Turistico: Praia");
                break;
            default:
                System.err.println("Opção inválida");

        }
    }
}
