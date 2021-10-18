package com.dbc.Aulas.Aula07.Enum;

public enum TipoCarro {
    SEDAN("Sedan"),
    ESPORTIVO("Esportivo"),
    HATCH,
    SUV;

    private String descricao;
    TipoCarro(){}
    TipoCarro(String descricao){
        this.descricao = descricao;
    }

}
