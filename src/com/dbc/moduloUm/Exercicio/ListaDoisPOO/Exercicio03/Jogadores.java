package com.dbc.Exercicio.ListaDoisPOO.Exercicio03;

public class Jogadores {
    private String[] nomeJogadores = new String[20];
    private Float[] alturaJogadores = new Float[20];
    private Integer[] idadeJogadores = new Integer[20];
    private Float[] pesoJogadores = new Float[20];

    Jogadores(){};

    public void setNomeJogadores(String nome){
        int auxiliar = retornaIndex();
        this.nomeJogadores[auxiliar] = nome;
    }

    public void setAlturaJogadores(Float alturaJogadores) {
        int auxiliar = retornaIndex();
        this.alturaJogadores[auxiliar] = alturaJogadores;
    }

    public void setIdadeJogadores(Integer idadeJogadores) {
        int auxiliar = retornaIndex();
        this.idadeJogadores[auxiliar] = idadeJogadores;
    }
    public void setPesoJogadores(Float pesoJogadores) {
        int auxiliar = retornaIndex();
        this.pesoJogadores[auxiliar] = pesoJogadores;
    }

    public void imprime(){//
        int aux = 0;
        float media = 0;

        System.out.printf("A maior altura: %s\n" +
                "O jogador mais velho: %s\n" +
                "O Mais pesado: %s\n" +
                "A média altura: %.2f\n"
                , retornaMaisAlto(), retonarMaisVelho(), retornaMaisPesado(), retornaMediaAltura());

    }
    private float retornaMaisAlto(){
        float maisAlto = 0;
        for(Float valor : alturaJogadores){
            if(valor != null){
                float aux = valor > maisAlto? maisAlto = valor : maisAlto;
            }
        }
        return maisAlto;
    }

    private int retonarMaisVelho(){
        int maisVelho = 0;
        for(Integer valor : idadeJogadores){
            if(valor != null){
                int aux = valor > maisVelho? maisVelho = valor : maisVelho;
            }
        }
        return maisVelho;
    }

    private float retornaMaisPesado(){
        float maisPesado = 0;
        for(Float valor : pesoJogadores){
            if(valor != null){
                float aux = valor > maisPesado? maisPesado = valor : maisPesado;
            }
        }
        return maisPesado;
    }

    private float retornaMediaAltura(){
        float soma = 0;
        int aux = 0;

        for(Float valor : alturaJogadores){
            if(valor != null){
                soma += valor;
                aux++;
            }
        }
        return soma / aux;
    }

    private int retornaIndex(){
        Integer index = 0;
        for(String valor : this.nomeJogadores){
            if(valor != null){
                index++;
            }
        }
        return index;
    }


}
