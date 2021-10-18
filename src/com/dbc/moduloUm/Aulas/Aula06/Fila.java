package com.dbc.Aulas.Aula06;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> minhaFila = new LinkedList<>();
        minhaFila.add("Guilherme");
        minhaFila.add("Camile");
        minhaFila.add("Maicon");

        System.out.println(minhaFila.poll());
        System.out.println(minhaFila.size());
        System.out.println(minhaFila);


    }
}
