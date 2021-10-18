package com.dbc.Exercicio.ListaUmPOO.Exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaixaMercado caixaMercado = new CaixaMercado();

        System.out.println("Valor total consumido: ");
        float valorConsumido = scanner.nextFloat();

        System.out.println("Valor pago pelo cliente: ");
        float valorPago = scanner.nextFloat();

        caixaMercado.calculaTotal(valorConsumido, valorPago);


    }
}
