package com.dbc.Aulas.Aula04.Heranca;

public abstract class Veiculo {
    private String nome;
    private int quilometragem;


    Veiculo(){}
    Veiculo(String nome, int quilometragem){
        this.nome = nome;
        this.quilometragem = quilometragem;
    }

    public int getQuilometragem(){
        return quilometragem;
    }
    public void setQuilometragem(int quilometragem){
        this.quilometragem = quilometragem;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
