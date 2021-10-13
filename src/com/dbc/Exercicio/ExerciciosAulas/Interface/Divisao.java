package com.dbc.Exercicio.ExerciciosAulas.Interface;

public class Divisao implements OperacaoMatemacia{
    Divisao(){}

    @Override
    public int calcula(int a, int b) {
        int aux = a == 0 ? a = 1 : a;
        int aux2 = b == 0? b = 1 : b;
        return a / b;
    }
}
