package com.dbc.Exercicio.ExerciciosAulas.Interface;

public class Multipicacao implements OperacaoMatemacia{
    Multipicacao(){}

    @Override
    public int calcula(int a, int b) {
        return a * b;
    }
}
