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
                setChequeEspecial(retornarSaldoComChequeEspecial());
            }
            System.out.println("Sacado com sucesso!");
            return true;
        }
        System.err.println("Saldo sem limite!!!");
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
