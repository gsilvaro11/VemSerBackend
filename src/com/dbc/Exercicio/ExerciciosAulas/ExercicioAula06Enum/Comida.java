package com.dbc.Exercicio.ExerciciosAulas.ExercicioAula06Enum;

public enum Comida {
    JAPONESA(50),
    FastFood(30),
    Tradicional(20);
    private int valor;

    Comida(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
