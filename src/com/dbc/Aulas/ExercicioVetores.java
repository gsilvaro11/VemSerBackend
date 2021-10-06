package com.dbc.Aulas;

import java.util.Arrays;

public class ExercicioVetores {
    public static void main(String[] args) {
        int[] numeros = {10,10,10};
        int n = Arrays.stream(numeros).sum();
        System.out.println("Soma: " + n + "\nMédia: " + n / numeros.length);
    }
}
