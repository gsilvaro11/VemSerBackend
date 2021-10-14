package com.dbc.Exercicio.HomeworkPOO2;

public class ContaPoupanca extends Conta implements Imprimir{
    static final Double JUROS_MENSAL = 1.01;

    public ContaPoupanca(Cliente cliente, String numeroConta, String agencia, Double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }

    public void creditarTaxa(){
        setSaldo(getSaldo() * JUROS_MENSAL);
    }

    @Override
    public boolean depositar(double depositar) {
        if(depositar < 10000d){
            setSaldo(getSaldo() + depositar);
            System.out.println("Deposito realizado com sucesso!");
            return true;
        }
        System.out.println("Limite de depósito de R$9.999,99");
        return false;
    }

    @Override
    public boolean sacar(double saque) {
        if (getSaldo() > 0 && getSaldo() >= saque){
            setSaldo(getSaldo() - saque);
            System.out.println("Sacado com sucesso!");
            return true;
        }
        System.err.println("Saldo sem limite!!!");
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
        creditarTaxa();
        System.out.printf("Conta Pagamento \n" +
                        "Nome cliente: %s\n" +
                        "Numero conta: %s\n" +
                        "Agencia: %s\n" +
                        "Saldo: %s\n" +
                        "Juros Mensal: %s\n",
                getCliente().getNomeCliente(),
                getNumeroConta(),
                getAgencia(),
                getSaldo(),
                JUROS_MENSAL);

    }
}
