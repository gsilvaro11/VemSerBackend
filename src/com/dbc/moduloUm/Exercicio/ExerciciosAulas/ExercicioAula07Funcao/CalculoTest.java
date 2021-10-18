package com.dbc.Exercicio.ExerciciosAulas.ExercicioAula07Funcao;


import org.junit.Test;
import static org.junit.Assert.*;

public class CalculoTest {

    @Test
    public void deveVerificarSoma(){
        //SETUP
        Calcula calcula = (valor1, valor2) -> {return valor1 + valor2;};

        //ATC
        int verifica = calcula.calculo(2,2);

        //Assert
        assertEquals(4, verifica);

    }

    @Test
    public void deveVerficarMultiplicacao(){
        //SETUP
        Calcula calculaMulti = (valor1, valor2) -> {return valor1 * valor2;};

        //ATC
        int verifica = calculaMulti.calculo(2,2);

        //Assert
        assertEquals(4,verifica);

    }

}
