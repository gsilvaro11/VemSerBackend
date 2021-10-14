package com.dbc.Exercicio.HomeworkPOO2;

public interface Movimentacao {
    boolean sacar(double saque);
    boolean depositar(double depositar);
    boolean transferir(Conta conta, Double valor);
}
