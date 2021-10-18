package com.dbc;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vem Ser - DBC");

        int[] numeros = {11,5,3};
        Arrays.sort(numeros, 0, 3);
        for (int valor : numeros){
            System.out.println(valor);
        }

    }

}


