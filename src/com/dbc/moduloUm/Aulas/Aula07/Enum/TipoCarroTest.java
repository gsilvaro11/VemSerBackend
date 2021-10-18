package com.dbc.Aulas.Aula07.Enum;

import org.testng.annotations.Test;

public class TipoCarroTest {
    @Test
    public void deveTestarNum(){
        TipoCarro tipoCarro = TipoCarro.SEDAN;

        for(TipoCarro tipo: TipoCarro.values()){
            System.out.print(tipo);
            System.out.println("ordinal" + tipoCarro.ordinal());
        }

    }
}
