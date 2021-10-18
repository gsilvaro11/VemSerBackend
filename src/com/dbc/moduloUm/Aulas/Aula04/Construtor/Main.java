package com.dbc.Aulas.Aula04.Construtor;

public class Main {
    public static void main(String[] args){

        Carro fiesta = new Carro("Teste", 12, "Verde");
        System.out.printf("Nome modelo %s ", fiesta.getModelo());

        System.out.println("\n");

        Carro gol = new Carro();
        gol.setModelo("Teste2");
        System.out.printf("Nome modelo %s ", gol.getModelo());

    }
}
