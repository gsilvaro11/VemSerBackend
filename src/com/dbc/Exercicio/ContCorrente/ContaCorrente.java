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
            saldo -= saque;
            return true;
        }
        return false;
    }

    public boolean depositarSaldo(double deposito){
        if(deposito > 0){
            saldo += deposito;
            return true;
        }
        return false;
    }

    public boolean transferirEntreContas(ContaCorrente corrente, double valor){
        if(valor > 0 && valor <= saldo){
            corrente.saldo += valor;
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double retornarSaldoMaisCheque(){
        return saldo + chequeEspecial;
    }

}
