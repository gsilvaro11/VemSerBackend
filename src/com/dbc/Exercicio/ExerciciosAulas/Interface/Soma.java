package com.dbc.Exercicio.ExerciciosAulas.Interface;

public class Soma implements OperacaoMatemacia{
    Soma(){}

    @Override
    public int calcula(int a, int b) {
        return a + b;
    }

}
