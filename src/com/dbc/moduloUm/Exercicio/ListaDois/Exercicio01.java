package com.dbc.Exercicio.ListaDois;

import java.util.Scanner;
/*
Elabore um programa para uma papelaria que leia o nome e o valor de um produto.
Em seguida, faça uma lista de 1 a 10 unidades do produto, sendo que o desconto de
uma unidade desse produto seja de 5% e de 2 seja 10% de 3 = 15% etc... Até
alcançar os 50% de desconto
*/
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite o preço do produto: ");
        float precoProduto = scanner.nextFloat();

        for(int i = 1; i <= 10; i++){
            float promocao = precoProduto - ((precoProduto * (i * 5)) / 100);
            System.out.printf("%s x R$ %.2f = R$ %.2f\n",
                    i, promocao, promocao * i);

        }

    }
}
