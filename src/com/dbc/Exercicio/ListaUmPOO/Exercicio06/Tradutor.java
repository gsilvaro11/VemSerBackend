package com.dbc.Exercicio.ListaUmPOO.Exercicio06;

public class Tradutor {
    private String lista[] = {"CACHORRO", "DOG", "TEMPO", "TIME",
            "AMOR", "LOVE", "CIDADE", "CITY", "FELIZ", "HAPPY"};

    public void tradutor(String palavra){
        for(int i = 0; i < lista.length; i++){
            if(palavra.toUpperCase().equals(lista[i])){
                int teste = i % 2 == 0 ? i + 1 : i - 1;
                System.out.printf("Palavra digitada: %s\nTradução: %s", palavra.toUpperCase(), lista[teste]);
                break;
            }else if(i + 1 == lista.length){
                System.err.println("Palavra não encontrada");
            }
        }
    }
}
