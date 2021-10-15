package com.dbc.Exercicio.ListaDoisPOO.Exercicio01;
/*
Elabore um programa para uma papelaria que leia o nome e o valor de um produto.
Em seguida, faça uma lista de 1 a 10 unidades do produto, sendo que o desconto de
uma unidade desse produto seja de 5% e de 2 seja 10% de 3 = 15% etc... Até
alcançar os 50% de desconto
*/
public class Main {
    public static void main(String[] args) {
        Papelaria novoPrudoto = new Papelaria("Lápis", 2);
        novoPrudoto.calculaDescontos();
    }
}
