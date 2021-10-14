package com.dbc.Exercicio.HomeworkPOO2;

public class Endereco {
    private int tipoEndereco; // 1 - Residencial, 2 - Comercial
    private String logradouro;
    private int numeroEndereco;
    private String complementoEndereco;
    private String cepEndereco;
    private String cidadeEndereco;
    private String paisEndereco;

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

    public int getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(int tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public String getCepEndereco() {
        return cepEndereco;
    }

    public void setCepEndereco(String cepEndereco) {
        this.cepEndereco = cepEndereco;
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }

    public String getPaisEndereco() {
        return paisEndereco;
    }

    public void setPaisEndereco(String paisEndereco) {
        this.paisEndereco = paisEndereco;
    }
}
