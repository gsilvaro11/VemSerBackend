package com.dbc.Exercicio.ContCorrente;

public class ContaCorrente {
    Cliente cliente;
    String numeroContaCorrente;
    int agenciaConta;
    double saldo;
    double chequeEspecial;

    public void imprimirContaCorrente(){
        System.out.printf("Nome: %s\nN° da Conta: %s\nAgencia: %s\nSaldo: %s\nCheque Especial: %s\n",
                cliente.nomeCliente, numeroContaCorrente, agenciaConta, saldo, chequeEspecial);
    }

    public boolean sacarSaldo(double saque){
        if(saque <= saldo && saque > 0){
            double saqueSaldoCheque = saldo - saque;
            saldo = saqueSaldoCheque;
            return true;
        }
        return false;
    }
    public boolean retonarSaldoComChequeEspecial(double saldoCheque){
        double saqueMaisCheque = saldoCheque + saldo;
        return true;
    }
    public boolean depositarSaldo(double deposito){
        if(deposito > 0){
            double depositoSaldo = saldo + deposito;
            saldo = depositoSaldo;
            return true;
        }
        return false;
    }

    public boolean transferirEntreContas(ContaCorrente corrente, double valor){
        if(valor > 0 && valor <= saldo){
            corrente.saldo  += valor;
            saldo -= valor;
            return true;
        }
        return false;
    }


}
