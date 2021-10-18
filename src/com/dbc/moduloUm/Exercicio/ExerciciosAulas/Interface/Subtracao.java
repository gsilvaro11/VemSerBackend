package com.dbc.Exercicio.ExerciciosAulas.Interface;

public class Subtracao implements OperacaoMatemacia{
    Subtracao(){}

    @Override
    public int calcula(int a, int b) {
        return a - b;
    }
}
