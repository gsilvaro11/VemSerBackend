package com.dbc.Aulas;

public class ArraysMatizesRepeticoes {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        numeros[0] = 5;
        numeros[1] = 20;
        numeros[2] = 16;

        System.out.println(numeros[2]);

        int[][] matrizNumeros = new int[2][2];
        matrizNumeros[0][0] = 29;
        matrizNumeros[0][1] = 77;
        matrizNumeros[1][0] = 14;
        matrizNumeros[1][1] = 67;

        int[] valores = {2,3,5,10,20};
        for(int index = 0; index < valores.length; index++){
            System.out.println(valores[index]);
        }

        for(int valor : valores){
            System.out.println(valor);
        }

    }
}
