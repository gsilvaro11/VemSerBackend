package com.dbc.Exercicio.HomeworkPOO2;

public class Main {
    public static void main(String[] args) {
        Contato guiContato = new Contato("Descricao", "998523476", 1);
        Endereco guiEndereco = new Endereco(1, "casa", 125, "fundos", "91420612",
                "Porto Alegre", "Brasil");

        Cliente guiCliente = new Cliente("Guilherme", "84622665623");
        ContaCorrente guiCorrente = new ContaCorrente(guiCliente, "100", "0010",
                1200.0d, 500d);
        ContaPagamento guiPagamento = new ContaPagamento(guiCliente, "3600", "0110",
                780d);

        guiCliente.setContato(guiContato);
        guiCliente.setEndereco(guiEndereco);

        // ************************************************//
        Contato lauraContato = new Contato("Descrição", "953265998", 2);
        Endereco lauraEndereco = new Endereco(1, "casa", 189, "fundos", "92232565",
                "Melbourne", "Estados Unidos");
        Cliente lauraCliente = new Cliente("Laura Guidugli", "846523265");
        ContaPoupanca lauraPoupanca = new ContaPoupanca(lauraCliente, "0788", "0006", 10000d);



        //**********************     Programa    **********************

        guiPagamento.imprimir();
        System.out.println("\n");
        lauraPoupanca.imprimir();

        System.out.println("\n");
//        guiPagamento.sacar(300);
//        lauraPoupanca.sacar(300);
//        guiPagamento.depositar(6000);
//        lauraPoupanca.depositar(2000);

        lauraPoupanca.transferir(guiPagamento, 360d);


        System.out.println("\n");
        guiPagamento.imprimir();
        System.out.println("\n");
        lauraPoupanca.imprimir();


    }
//    static public ContaCorrente guiContaCorrente(){
//        Contato guiContato = new Contato("Descricao", "998523476", 1);
//        Endereco guiEndereco = new Endereco(1, "casa", 125, "fundos", "91420612",
//                "Porto Alegre", "Brasil");
//
//        Cliente guiCliente = new Cliente("Guilherme", "84622665623");
//        ContaCorrente guiCorrente = new ContaCorrente(guiCliente, "100", "0010",
//                1200.0d, 500d);
//
//        //          Guilherme informações       //
//        guiCliente.setContato(guiContato);
//        guiCliente.setEndereco(guiEndereco);
//        //
//
//        return guiCorrente;
//    }
//    static public ContaPagamento guiContaPagamento(){
//        Contato guiContato = new Contato("Descricao", "998523476", 1);
//        Endereco guiEndereco = new Endereco(1, "casa", 125, "fundos", "91420612",
//                "Porto Alegre", "Brasil");
//
//        Cliente guiCliente = new Cliente("Guilherme", "84622665623");
//        ContaPagamento guiPagamento = new ContaPagamento(guiCliente, "3600", "0110",
//                780d);
//
//        //          Guilherme informações       //
//        guiCliente.setContato(guiContato);
//        guiCliente.setEndereco(guiEndereco);
        //
//
//        return guiPagamento;
//    }
}
