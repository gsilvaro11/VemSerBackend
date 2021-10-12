package com.dbc.Exercicio.ListaUmPOO.Exercicio02;

import java.util.Scanner;

public class CalculaMediaNotas {
    private Float[] notas = new Float[4];

    static Scanner scanner = new Scanner(System.in);

    public void valoresNotas(){
        for(int i = 0; i < this.notas.length; i++){
            System.out.printf("Digite a %s° nota: ", i+1);
            this.notas[i] = scanner.nextFloat();
        }
    }

    private Float retornaMedia() {
        float valorSoma = 0;
        for(float valores : this.notas){
            valorSoma += valores;
        }
        return valorSoma / this.notas.length;
    }

    public void imprimeNotasMedia(){
        for (float valores : this.notas){
            System.out.printf("Nota: %s \n", valores);
        }
        System.out.printf("Média: %s ", retornaMedia());

    }

}
