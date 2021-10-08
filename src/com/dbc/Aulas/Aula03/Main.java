package com.dbc.Aulas.Aula03;

public class Main {
    public static void main(String[] args) {
        Pessoa guilherme = new Pessoa();
        guilherme.nome = "Guilherme";
        guilherme.idade = 22;
        guilherme.telefone.numero = "51985234767";


        Pessoa laura = new Pessoa("Laura", 22);


        guilherme.conversar(laura, " Vai estudar ");
        int deferencaIdade = guilherme.diferencaIdade(laura);
        System.out.printf("Diferença de idade é %s", deferencaIdade);
    }
}
