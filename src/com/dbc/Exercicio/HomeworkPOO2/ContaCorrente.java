package com.dbc.Exercicio.HomeworkPOO2;

public class ContaCorrente extends Conta implements Imprimir{
    private Double chequeEspecial;


    ContaCorrente(Cliente cliente, String numeroConta, String agencia, Double saldo, Double chequeEspecial){
        super(cliente,numeroConta,agencia,saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public Double retornarSaldoComChequeEspecial(){
        return chequeEspecial + getSaldo();
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    @Override
    public boolean sacar(double saque) {
        if (retornarSaldoComChequeEspecial() > 0 && retornarSaldoComChequeEspecial() >= saque){
            setSaldo(getSaldo() - saque);
            if(getSaldo() <= 0){
                setChequeEspecial(getChequeEspecial() + getSaldo());
            }
            System.out.println("Sacado com sucesso!");
            return true;
        }
        System.err.println("Saldo sem limite!!!");
        return false;
    }

    @Override
    public boolean depositar(double depositar) {
        if(depositar < 10000d){
            setSaldo(getSaldo() + depositar);
            System.out.println("Deposito realizado com sucesso!");
            return true;
        }
        System.err.println("Limite de depósito de R$9.999,99");
        return false;
    }

    @Override
    public boolean transferir(Conta conta, Double valor) {
        if(this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            conta.setSaldo(conta.getSaldo() + valor);
            System.out.println("Transferencia concluida!");
            return true;
        }
        System.err.println("Saque cancelado, valor inválido");
        return false;
    }

    @Override
    public void imprimir() {
        System.out.printf("Conta Corrente \n" +
                "Nome cliente: %s\n" +
                "Numero conta: %s\n" +
                "Agencia: %s\n" +
                "Saldo: %s\n" +
                "Cheque Especial: %s\n",
                getCliente().getNomeCliente(),
                getNumeroConta(),
                getAgencia(),
                getSaldo(),
                getChequeEspecial());
    }
}
