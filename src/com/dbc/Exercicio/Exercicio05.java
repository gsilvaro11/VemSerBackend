package com.dbc.Exercicio;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de horas trabalhadas: ");
        Float valorHora = scanner.nextFloat();
        Float vH = valorHora > 0 ? valorHora : 1;

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        Float horasTrabalhadas = scanner.nextFloat();
        Float hT = horasTrabalhadas > 0 ? horasTrabalhadas : 1;

        System.out.println("Digite a quantidade de horas extras trabalhadas: ");
        Float horaExtra = scanner.nextFloat();
        Float hE = horaExtra > 0 ? horaExtra : 1;

        Float horasExtrasTrabalhadas = vH * 2;

        Float valorBruto = vH * hT + (hE * horasExtrasTrabalhadas);
        System.out.printf("Salário bruto: %s", valorBruto);

    }
}
