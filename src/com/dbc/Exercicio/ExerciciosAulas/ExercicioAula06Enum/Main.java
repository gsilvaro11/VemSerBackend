package com.dbc.Exercicio.ExerciciosAulas.ExercicioAula06Enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual tipo de comida?: ");
        String tipoComida = scanner.next();
        String formata = tipoComida.replaceAll(" ","");

        if(formata.equals("japonesa")){
            System.out.println("O valor é " + Comida.JAPONESA.getValor());
        }else if(formata.equals("fast")){
            System.out.println("O valor é " + Comida.FastFood.getValor());
        }else if(formata.equals("tradicional")){
            System.out.println("O valor é " + Comida.Tradicional.getValor());
        }else {
            System.err.println("Tipo de comida não cadastrada!");
        }

    }
}
