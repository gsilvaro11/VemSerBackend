package com.dbc.Exercicio.HomeworkPOO2;

public class ContaPagamento extends Conta implements Imprimir{
    static final Double TAXA_SAQUE = 4.25d;

    public ContaPagamento(Cliente cliente, String numeroConta, String agencia, Double saldo) {
        super(cliente, numeroConta, agencia, saldo);
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
        if (getSaldo() > 0 && (getSaldo() - TAXA_SAQUE) >= saque){
            setSaldo((getSaldo() - TAXA_SAQUE) - saque);
            System.out.println("Sacado com sucesso!");
            return true;
        }
        System.err.println("Saldo sem limite!!!");
        return false;
    }

    @Override
    public boolean transferir(Conta conta, Double valor) {
        if((this.getSaldo() - TAXA_SAQUE) >= valor){
            setSaldo((getSaldo() - TAXA_SAQUE) - valor);
            conta.setSaldo(conta.getSaldo() + valor);
            System.out.println("Transferencia concluida!");
            return true;
        }
        System.err.println("Saque cancelado, valor inválido");
        return false;
    }

    @Override
    public void imprimir() {
        System.out.printf("Conta Pagamento \n" +
                        "Nome cliente: %s\n" +
                        "Numero conta: %s\n" +
                        "Agencia: %s\n" +
                        "Saldo: %s\n" +
                        "Taxa saque: %s\n",
                getCliente().getNomeCliente(),
                getNumeroConta(),
                getAgencia(),
                getSaldo(),
                TAXA_SAQUE);

    }
}
