package com.dbc.moduloUm.Exercicio.ExerciciosAulas.ExercicioAula07Funcao;


import org.junit.Test;
import static org.junit.Assert.*;

public class CalculoTest {

    @Test
    public void deveVerificarSoma(){
        //SETUP
        com.dbc.Exercicio.ExerciciosAulas.ExercicioAula07Funcao.Calcula calcula = (valor1, valor2) -> {return valor1 + valor2;};

        //ATC
        int verifica = calcula.calculo(2,2);

        //Assert
        assertEquals(4, verifica);

    }

    @Test
    public void deveVerficarMultiplicacao(){
        //SETUP
        com.dbc.Exercicio.ExerciciosAulas.ExercicioAula07Funcao.Calcula calculaMulti = (valor1, valor2) -> {return valor1 * valor2;};

        //ATC
        int verifica = calculaMulti.calculo(2,2);

        //Assert
        assertEquals(4,verifica);

    }

}
