package com.dbc.Exercicio.ContCorrente;

public class Contato {
    String descricaoContato;
    String telefoneContato;
    int tipoContato; // 1 - residencial, 2 - comercial

    Contato(){}
    Contato(String descricaoContato, String telefoneContato, int tipoContato){
        this.descricaoContato = descricaoContato;
        this.telefoneContato = telefoneContato;
        this.tipoContato = tipoContato;
    }

    public void setDescricaoContato(String descricaoContato){
        this.descricaoContato = descricaoContato;
    }
    public String getDescricaoContato(){return this.descricaoContato;}


    public void setTelefoneContato(String telefoneContato){
        this.telefoneContato = telefoneContato;
    }
    public String getTelefoneContato(){return this.getDescricaoContato();}

    public void setTipoContato(int tipoContato){
        this.tipoContato = tipoContato;
    }
    public int getTipoContato(){
        return this.tipoContato;
    }

    public void imprimirContato(){
        System.out.printf("Descrição: %s\nTelefone: %s\nTipo Contato %s",
                descricaoContato, telefoneContato, tipoContato);
    }
}
