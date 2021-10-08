package com.dbc.Exercicio.ContCorrente;

public class Endereco {
    int tipoEndereco; // 1 - Residencial, 2 - Comercial
    String logradouro;
    int numeroEndereco;
    String complementoEndereco;
    String cepEndereco;
    String cidadeEndereco;
    String paisEndereco;

    public void imprimirEndereco(){
        System.out.printf("Tipo: %s\nLogradouro: %s\nNumero: %s\nComplemento: %s\nCep: %s\nCidade: %s\n" +
                "Pais: %s", tipoEndereco, logradouro, numeroEndereco, complementoEndereco, cepEndereco
                 ,cidadeEndereco,paisEndereco);
    }
}
