package com.dbc.Aulas.Aula03;

public class Main {
    public static void main(String[] args) {
        Pessoa guilherme = new Pessoa();
        guilherme.nome = "Guilherme";
        guilherme.idade = 22;
        guilherme.telefone.numero = "51985234767";

        Pessoa maicon = new Pessoa();
        maicon.nome =  "Maicon";
        maicon.idade = 30;



        guilherme.conversar(maicon, " Vai estudar ");
        int deferencaIdade = guilherme.diferencaIdade(maicon);
        System.out.printf("Diferença de idade é %s", deferencaIdade);
    }
}
