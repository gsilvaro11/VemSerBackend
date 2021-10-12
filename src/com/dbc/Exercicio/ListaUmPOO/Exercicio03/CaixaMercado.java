package com.dbc.Exercicio.ListaUmPOO.Exercicio03;

public class CaixaMercado {

    public void calculaTotal(float valorC, float valorP){
        if(valorP < valorC){
            System.err.printf("O valor pago deve ser maior ou igual ao valor consumido, faltam %s reais!"
                    , valorC - valorP);

        }else {
            System.out.printf("Troco do cliente %s", valorP - valorC);
        }
    }
}
