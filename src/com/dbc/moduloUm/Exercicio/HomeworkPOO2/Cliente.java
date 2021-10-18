package com.dbc.Exercicio.HomeworkPOO2;


public class Cliente {
    private String nomeCliente;
    private String cpfCliente;
    private Contato[] contato = new Contato[2];
    private Endereco[] endereco = new Endereco[2];

    Cliente(){}
    Cliente(String nomeCliente, String cpfCliente){
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
    }



    public void imprimirContatos(){
        for(int i = 0; i < contato.length; i++){
            if(contato[i] != null){
                System.out.println("Tipo contato: " + contato[i].getTipo());
                System.out.println("Telefone: " + contato[i].getTelefone());
                System.out.println("Descrição: " + contato[i].getDescricao());
            }
        }
    }
    public void imprimirEnderecos(){
        for(int i = 0; i < contato.length; i++){
            if(endereco[i] != null) {
                System.out.println(endereco[i].getCepEndereco());
                System.out.println(endereco[i].getLogradouro());
                System.out.println(endereco[i].getNumeroEndereco());
                System.out.println(endereco[i].getComplementoEndereco());
                System.out.println(endereco[i].getCepEndereco());
                System.out.println(endereco[i].getCidadeEndereco());
                System.out.println(endereco[i].getPaisEndereco());
            }
        }
    }
    public void imprimirCliente(){
        System.out.printf("Nome: %s\nCPF: %s", this.nomeCliente, this.cpfCliente);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Contato[] getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato[0] = contato;
    }

    public Endereco[] getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco[0] = endereco;
    }
}
