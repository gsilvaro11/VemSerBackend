package com.dbc.Exercicio.ContCorrente;

public class Contato {
    String descricaoContato;
    String telefoneContato;
    int tipoContato; // 1 - residencial, 2 - comercial

    public void imprimirContato(){
        System.out.printf("Descrição: %s\nTelefone: %s\nTipo Contato %s",
                descricaoContato, telefoneContato, tipoContato);
    }
}
