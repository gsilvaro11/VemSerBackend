package com.dbc.Exercicio.ContCorrente;

public class ContaCorrente {
    private Cliente cliente;
    private String numeroContaCorrente;
    private int agenciaConta;
    private double saldo;
    private double chequeEspecial;

    ContaCorrente(){}

    ContaCorrente(Cliente cliente, String numeroContaCorrente, int agenciaConta, double saldo, double chequeEspecial){
        this.cliente = cliente;
        this.numeroContaCorrente = numeroContaCorrente;
        this.agenciaConta = agenciaConta;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }


    public void imprimirContaCorrente(){
        System.out.printf("Nome: %s\nN° da Conta: %s\nAgencia: %s\nSaldo: %s\nCheque Especial: %s\n",
                cliente.getNomeCliente(), numeroContaCorrente, agenciaConta, saldo, chequeEspecial);
    }


    public boolean sacarSaldo(double saque){
        if(saque <= saldo && saque > 0){
            this.saldo -= saque;
            return true;
        }
        return false;
    }

    public boolean depositarSaldo(double deposito){
        if(deposito > 0){
            this.saldo += deposito;
            return true;
        }
        return false;
    }

    public boolean transferirEntreContas(ContaCorrente corrente, double valor){
        if(valor > 0 && valor <= this.saldo){
            corrente.saldo += valor;
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public double retornarSaldoMaisCheque(){
        return this.saldo + this.chequeEspecial;
    }

}
