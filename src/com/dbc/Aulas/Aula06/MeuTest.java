package com.dbc.Aulas.Aula06;

import org.junit.Test;

import static org.junit.Assert.*;

public class MeuTest {
    @Test
    public void deveTestarSeONumeroEhParComSucesso(){
        //SETUP
        int valor = 11;

        //ACT AÇÃO
        boolean ehPar = valor % 2 == 0;

        //ASSERT (Verificação)
        assertFalse(ehPar);

    }

    @Test
    public void deveTestarValorIgual(){
        //SETUP
        int idade = 22;
        String porExtenso =  "Guilherme tem " + idade + " anos.";

        //ASSERT (Verificação)
        assertEquals(22, idade);
        assertEquals("Guilherme tem 22 anos.", porExtenso);

    }

    @Test
    public void deveTestarValorNaoIgual(){
        //SETUP
        int idade = 22;
        String porExtenso =  "Guilherme tem " + idade + " anos.";

        //ASSERT (Verificação)
        assertNotEquals(21, idade);
        assertNotEquals("Guilherme tem 21 anos.", porExtenso);

    }

}
