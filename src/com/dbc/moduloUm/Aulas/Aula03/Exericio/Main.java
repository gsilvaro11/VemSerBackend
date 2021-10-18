package com.dbc.Aulas.Aula03.Exericio;

public class Main {
    public static void main(String[] args) {
        Pessoa guilherme = new Pessoa();
        guilherme.setNome("Guilherme");
        guilherme.setSobrenome("Silva");
        guilherme.setIdade(22);
        guilherme.setWhatsapp("51999552742");

        Pessoa laura = new Pessoa();
        laura.setNome("Laura");
        laura.setSobrenome("Guidugli");
        laura.setIdade(21);
        laura.setWhatsapp("5199999999");

        guilherme.conversar(laura);// Guilherme conversou com laura

        String nomeCompleotoGuilherme = guilherme.retonarNomeCompleto();
        System.out.println(nomeCompleotoGuilherme);

        boolean maiorIdade = guilherme.ehMaiorDeIdade();
        System.out.println(maiorIdade);

        guilherme.mandarWhatsApp(laura, "Te amo!...");
    }
}
