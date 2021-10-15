package com.dbc.Exercicio.HomeworkPOO2;

public class ContaPoupanca extends Conta implements Imprimir{
    private static final Double JUROS_MENSAL = 1.01;


    ContaPoupanca(){}
    public ContaPoupanca(Cliente cliente, String numeroConta, String agencia, Double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }

    public void creditarTaxa(){
        super.setSaldo(getSaldo() * JUROS_MENSAL);
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
    public void imprimir() {
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
