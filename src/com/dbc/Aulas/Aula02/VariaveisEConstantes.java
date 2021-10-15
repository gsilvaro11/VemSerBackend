package com.dbc.Aulas.Aula02;

public class VariaveisEConstantes {
    public static void main(String[] args){

        String nome = "Guilherme";
        int idade = 22;
        float altura = 1.65f;
        boolean ehSolteiro = false;
        final var mensagem = "O nome é " + nome + ", com " + idade + " anos, " + altura + " de altura, é solteiro? " + ehSolteiro;

        System.out.println(mensagem);
        System.out.println();
    }
}
