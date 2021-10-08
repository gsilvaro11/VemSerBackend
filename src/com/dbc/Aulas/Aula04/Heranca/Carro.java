package com.dbc.Aulas.Aula04.Heranca;

public class Carro extends Veiculo{
    private String modeloMotor;
    private int potencia;
    private int velocidadeMaxima;

    public Carro(){}

    public Carro(String nome,String modeloMotor, int potencia, int velocidadeMaxima){
        this.modeloMotor = modeloMotor;
        this.potencia = potencia;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getModeloMotor(){return modeloMotor;}
    public void setModeloMotor(String modeloMotor){
        this.modeloMotor = modeloMotor;
    }

    public int getPotencia(){
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
