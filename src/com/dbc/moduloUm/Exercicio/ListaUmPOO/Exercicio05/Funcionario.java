package com.dbc.Exercicio.ListaUmPOO.Exercicio05;

public class Funcionario {
    private String nome;
    private float salarioHoras;
    private float horasTrabalhadas;
    private float horasExtras50;
    private float horasExtras100;

    Funcionario(String nome, float sH, float hT, float hE, float hE100){
        this.nome = nome;
        this.salarioHoras = sH;
        this.horasTrabalhadas = hT;
        this.horasExtras50 = hE;
        this.horasExtras100 = hE100;

    }

    private float calculaSalario(){
        float valorExtras50 = this.horasExtras50 * (this.salarioHoras * 50 / 100);
        float valorExtras100 = this.horasExtras100 * this.salarioHoras;
        float valorExtras = valorExtras50 + valorExtras100;
        float valorBruto = salarioHoras * horasTrabalhadas + (valorExtras);
        return valorBruto;
    }

    public void imprime(){
        System.out.printf("Nome Funcionário %s" +
                "\nSalário hora = %s" +
                "\nHoras Trabalhadas = %s" +
                "\nHoras extras 50 = %s" +
                "\nHoras extras 10 = %s" +
                "\nSalário Bruto = %s\n", this.nome, this.salarioHoras, this.horasTrabalhadas, this.horasExtras50, this.horasExtras100,
                calculaSalario());
    }

}
