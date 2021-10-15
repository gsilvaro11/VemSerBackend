package com.dbc.Aulas.Aula05.Interface;

public class VeiculoComMotor implements Motor, Veiculo{
    private String modeloMotor;
    private int potencia;
    private int quilometragem;
    private String nome;


    @Override
    public String getModeloMotor() {
        return null;
    }

    @Override
    public int getPotencia() {
        return 0;
    }

    @Override
    public int getQuilometragem() {
        return 0;
    }

    @Override
    public String getNome() {
        return null;
    }
}
