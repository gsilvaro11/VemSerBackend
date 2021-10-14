package com.dbc.Exercicio.HomeworkPOO2;

public abstract class Conta implements Movimentacao{
    private Cliente cliente;
    private String numeroConta;
    private String agencia;
    private Double saldo;

    public Conta(Cliente cliente, String numeroConta, String agencia, Double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    @Override
    public boolean sacar(double saque) {
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

}
