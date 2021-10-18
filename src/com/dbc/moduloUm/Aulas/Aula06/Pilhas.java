package com.dbc.Aulas.Aula06;

import java.util.Stack;

public class Pilhas {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        pilha.add("Guilherme");
        pilha.add("Bruno");
        pilha.add("Maicon");

        System.out.println(pilha.pop());
        System.out.println(pilha);
        System.out.println(pilha.size());
    }
}
