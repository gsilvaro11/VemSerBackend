package com.dbc.Aulas.Aula04.Heranca;

public abstract class Veiculo {
    private int quilometragem;
    private String nome;


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
