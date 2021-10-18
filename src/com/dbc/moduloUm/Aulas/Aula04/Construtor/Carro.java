package com.dbc.Aulas.Aula04.Construtor;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    public Carro(){
    }
    public Carro(String modelo, int ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }




}
