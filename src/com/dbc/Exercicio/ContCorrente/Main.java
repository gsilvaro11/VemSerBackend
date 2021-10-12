package com.dbc.Exercicio.ContCorrente;

public class Main {
    public static void main (String[] args) {
        //**********    Cliente 1   **********
        Cliente clienteGuilherme = new Cliente("Guilherme", "846966598946");
        clienteGuilherme.endereco[0] = new Endereco();
        clienteGuilherme.contato[0] = new Contato();
        ContaCorrente contaCorrenteGuilherme = new ContaCorrente(
                clienteGuilherme, "32266", 3600, 1200.0, 1000.0);



        //**********    Cliente2    **********
        Cliente clienteLaura = new Cliente("Laura", "84696323984");
        clienteLaura.endereco[0] = new Endereco();
        clienteLaura.contato[0] = new Contato();
        ContaCorrente contaCorrenteLaura = new ContaCorrente(
                clienteLaura, "455659", 1120, 10300.0, 5000.0);


        //**********    Dados Cliente Guilherme, nome, end, cont    **********
        clienteGuilherme.endereco[0].tipoEndereco = 1;
        clienteGuilherme.endereco[0].logradouro = "Rua aleatória teste";
        clienteGuilherme.endereco[0].numeroEndereco = 105;
        clienteGuilherme.endereco[0].complementoEndereco = "null";
        clienteGuilherme.endereco[0].cepEndereco = "92365-02";
        clienteGuilherme.endereco[0].cidadeEndereco = "Porto Alegre";
        clienteGuilherme.endereco[0].paisEndereco = "Brasil";
        clienteGuilherme.contato[0].descricaoContato = "Descrição badaras";
        clienteGuilherme.contato[0].telefoneContato = "51999552742";
        clienteGuilherme.contato[0].tipoContato = 1;


        //**********    Dados Cliente Laura, nome, end, cont    **********www
        clienteLaura.endereco[0].tipoEndereco = 1;
        clienteLaura.endereco[0].logradouro = "Rua aleatória teste2";
        clienteLaura.endereco[0].numeroEndereco = 10658;
        clienteLaura.endereco[0].complementoEndereco = "null";
        clienteLaura.endereco[0].cepEndereco = "925688-02";
        clienteLaura.endereco[0].cidadeEndereco = "Melborne";
        clienteLaura.endereco[0].paisEndereco = "Estados Unidos";
        clienteLaura.contato[0].descricaoContato = "Descrição badaras 2";
        clienteLaura.contato[0].telefoneContato = "9559559565";
        clienteLaura.contato[0].tipoContato = 1;


        //**********    FIM Dados Cliente Laura    **********

/*
        //**********    Imprime contatos    **********
        clienteGuilherme.imprimirContatos();
        clienteLaura.imprimirContatos();


        **********    Imprime Endereco    **********
        clienteGuilherme.imprimirEnderecos();
        System.out.println("************************");
        clienteLaura.imprimirEnderecos();

        **********    Imprime Cliente    **********
        clienteGuilherme.imprimirCliente();
        System.out.println("\n************************");
        clienteLaura.imprimirCliente();
        */

        contaCorrenteGuilherme.imprimirContaCorrente();
        System.out.println("\n*********************\n");
        contaCorrenteLaura.imprimirContaCorrente();
        System.out.println("\n\n*********************\n");

        contaCorrenteGuilherme.transferirEntreContas(contaCorrenteLaura, 300);

        contaCorrenteGuilherme.imprimirContaCorrente();
        System.out.println("\n*********************");
        contaCorrenteLaura.imprimirContaCorrente();

    }
}
