package com.dbc.Exercicio.HomeworkPOO2;


import org.junit.Test;
import static org.junit.Assert.*;

public class Testes {

    @Test
    public void deveTestarSaqueContaPoupancaEVerificarSaldoComSucesso(){
        //SETUP
        ContaPoupanca teste = new ContaPoupanca();
        teste.setSaldo(10000d);
        teste.creditarTaxa();

        //ACT
        boolean sacar = teste.sacar(5000);
        Double saldo = teste.getSaldo();

        //ASSERT
        assertTrue(sacar);
        assertEquals(5100, saldo, 0);
    }

    @Test
    public void deveTestarSaqueContaPoupancaSemSaldo(){
        //SETUP
        ContaPoupanca teste = new ContaPoupanca();
        teste.setSaldo(1000d);

        //ACT
        boolean sacar = teste.sacar(5000);
        Double saldo = teste.getSaldo();

        //ASSERT
        assertFalse(sacar);
        assertEquals(1000, saldo, 0);
    }

    @Test
    public void deveTestarSaqueContaPagamentoEVerificarSaldoComSucesso(){
        //SETUP
        ContaPagamento testePagamento = new ContaPagamento();
        testePagamento.setSaldo(1000d);

        //ACT
        boolean sacar = testePagamento.sacar(500);
        Double saldo = testePagamento.getSaldo();

        //ASSERT
        assertTrue(sacar);
        assertEquals(495.75, saldo, 0);
    }

    @Test
    public void deveTestarSaqueContaPagamentoSemSaldo(){
        //SETUP
        ContaPagamento testePagamento = new ContaPagamento();
        testePagamento.setSaldo(1000d);

        //ACT
        boolean sacar = testePagamento.sacar(5000);
        Double saldo = testePagamento.getSaldo();

        //ASSERT
        assertFalse(sacar);
        assertEquals(1000, saldo, 0);
    }

    @Test
    public void deveTestarTransferenciaEVerificarSaldoComSucesso(){
        //SETUP
        ContaCorrente guilherme = new ContaCorrente();
        ContaCorrente laura = new ContaCorrente();
        guilherme.setSaldo(1000d);
        laura.setSaldo(500d);

        //ACT
        boolean transferir = guilherme.transferir(laura, 500d);
        Double saldo = guilherme.getSaldo();

        //ASSERT
        assertTrue(transferir);
        assertEquals(500, saldo, 0);
    }

    @Test
    public void deveTestarTransferenciaSemSaldo(){
        //SETUP
        ContaCorrente guilherme = new ContaCorrente();
        ContaCorrente laura = new ContaCorrente();
        guilherme.setSaldo(1000d);
        laura.setSaldo(500d);

        //ACT
        boolean transferir = guilherme.transferir(laura, 5000d);
        Double saldo = guilherme.getSaldo();

        //ASSERT
        assertFalse(transferir);
        assertEquals(1000, saldo, 0);
    }

    @Test
    public void deveTestarDepositoEVerificarSaldoComSucesso(){
        //SETUP
        ContaCorrente testeDeposito = new ContaCorrente();
        testeDeposito.setSaldo(1000d);

        //ACT
        boolean verificaDeposito = testeDeposito.depositar(1000);
        Double saldo = testeDeposito.getSaldo();

        //ASSERT
        assertTrue(verificaDeposito);
        assertEquals(2000, saldo, 0);

    }

    @Test
    public void deveTestarDepositoNegativo(){
        //SETUP
        ContaCorrente testeDeposito = new ContaCorrente();
        testeDeposito.setSaldo(1000d);

        //ACT
        boolean verificaDeposito = testeDeposito.depositar(-1000);
        Double saldo = testeDeposito.getSaldo();

        //ASSERT
        assertFalse(verificaDeposito);
        assertEquals(1000, saldo, 0);

    }

}
