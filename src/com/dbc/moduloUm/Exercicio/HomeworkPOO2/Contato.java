package com.dbc.Exercicio.HomeworkPOO2;

public class Contato {
    private String descricao;
    private String telefone;
    private int tipo; // 1 - Residencial, 2 - Comercial

    Contato(){}
    Contato(String descricao, String telefone, int tipo){
        this.descricao = descricao;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public void imprimirContato(){
        System.out.printf("Descrição: %s\nTelefone: %s\nTipo: %s\n", this.descricao, this.telefone,
                this.tipo);
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
