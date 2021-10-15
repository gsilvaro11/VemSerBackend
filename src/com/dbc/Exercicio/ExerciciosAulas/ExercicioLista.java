package com.dbc.Exercicio.ExerciciosAulas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioLista {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        String sair = "";
        int aux = 1;
        do {
            System.out.printf("Digite o %s nome: ", aux);
            String nome = scanner.next();

            listaNomes.add(nome);
            System.out.println("Deseja sair? [S/N] ");
            String auxiliar = scanner.next();

            String verifica = auxiliar.equals("s") ? sair = "s" : auxiliar;
            aux++;

        } while (!sair.toLowerCase(Locale.ROOT).equals("s"));

        System.out.println("Penultimo nome: " + listaNomes.get(listaNomes.size() - 2));
        System.out.println("Primeiro nome: " + listaNomes.get(0));
        listaNomes.remove(listaNomes.size() - 1);
        System.out.println("Quantidade de nomes restantes: " + listaNomes.size());
        for (String valor : listaNomes){
            System.out.println(valor);
        }
    }



}
