package com.dbc.Exercicio.ListaUm;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor total consumido: ");
        float valorConsumido = scanner.nextFloat();

        System.out.println("Valor pago pelo cliente: ");
        float valorPago = scanner.nextFloat();

        if(valorPago < valorConsumido){
            System.err.printf("O valor pago deve ser maior ou igual ao valor consumido, faltam %s reais!"
            , valorConsumido - valorPago);

        }else {
            System.out.printf("Troco do cliente %s", valorPago - valorConsumido);
        }

    }
}

