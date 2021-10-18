package com.dbc.Exercicio.ContCorrente;

public class Endereco {
    int tipoEndereco; // 1 - Residencial, 2 - Comercial
    String logradouro;
    int numeroEndereco;
    String complementoEndereco;
    String cepEndereco;
    String cidadeEndereco;
    String paisEndereco;

    Endereco(){}
    Endereco(int tp, String lg, int numE, String compEnd, String cep, String cdd, String pais){
        this.tipoEndereco = tp;
        this.logradouro = lg;
        this.numeroEndereco = numE;
        this.complementoEndereco = compEnd;
        this.cepEndereco = cep;
        this.cidadeEndereco = cdd;
        this.paisEndereco = pais;
    }

    public void imprimirEndereco(){
        System.out.printf("Tipo: %s\nLogradouro: %s\nNumero: %s\nComplemento: %s\nCep: %s\nCidade: %s\n" +
                "Pais: %s", tipoEndereco, logradouro, numeroEndereco, complementoEndereco, cepEndereco
                 ,cidadeEndereco,paisEndereco);
    }
}
