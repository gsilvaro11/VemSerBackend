package com.dbc.Exercicio.ContCorrente;

public class Cliente {
    String nomeCliente;
    String cpfCliente;
    Contato[] contato = new Contato[2];
    Endereco[] endereco = new Endereco[2];

    public void imprimirContatos(){
        for(int i = 0; i < 1; i++){
            System.out.println(contato[i].tipoContato);
            System.out.println(contato[i].telefoneContato);
            System.out.println(contato[i].descricaoContato);
        }
    }
    public void imprimirEnderecos(){
        for(int i = 0; i < 1; i++){
            System.out.println(endereco[i].tipoEndereco);
            System.out.println(endereco[i].logradouro);
            System.out.println(endereco[i].numeroEndereco);
            System.out.println(endereco[i].complementoEndereco);
            System.out.println(endereco[i].cepEndereco);
            System.out.println(endereco[i].cidadeEndereco);
            System.out.println(endereco[i].paisEndereco);

        }
    }
    public void imprimirCliente(){
        System.out.printf("Nome: %s\nCPF: %s", nomeCliente, cpfCliente);
    }
}
