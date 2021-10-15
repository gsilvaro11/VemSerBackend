package com.dbc.Exercicio.ExerciciosAulas;

import java.util.Scanner;
import java.util.Stack;

public class ExericioPilhas {
    public static void main(String[] args) {
        Stack<Integer> numeros = new Stack<>();
        Scanner scanner = new Scanner(System.in);


        for(int i = 0; i < 15; i++){
            System.out.printf("Digite o %s numero: ", i+1);
            Integer number = scanner.nextInt();
            if(number % 2 == 0){
                numeros.add(number);
            }
        }
        System.out.println(numeros);
        while (!numeros.isEmpty()){
            System.out.println(numeros.pop());
        }

    }
}
