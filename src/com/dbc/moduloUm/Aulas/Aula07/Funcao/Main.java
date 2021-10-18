package com.dbc.Aulas.Aula07.Funcao;

public class Main {
    public static void main(String[] args) {

        Funcao funcao = valor -> {return "Sr. " + valor;};
        System.out.println(funcao.gerar("Guilherme"));

    }
}
