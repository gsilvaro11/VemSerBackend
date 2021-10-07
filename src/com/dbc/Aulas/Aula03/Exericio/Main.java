package com.dbc.Aulas.Aula03.Exericio;

public class Main {
    public static void main(String[] args) {
        Pessoa guilherme = new Pessoa();
        guilherme.nome = "Guilherme";
        guilherme.sobrenome = "Silva";
        guilherme.idade = 22;
        guilherme.whatsapp = "51999552742";

        Pessoa laura = new Pessoa();
        laura.nome = "Laura";
        laura.sobrenome = "Guidugli";
        laura.idade = 21;
        laura.whatsapp = "5199999999";

        guilherme.conversar(laura);// Guilherme conversou com laura

        String nomeCompleotoGuilherme = guilherme.retonarNomeCompleto();
        System.out.println(nomeCompleotoGuilherme);

        boolean maiorIdade = guilherme.ehMaiorDeIdade();
        System.out.println(maiorIdade);

        guilherme.mandarWhatsApp(laura, "Te amo!...");
    }
}
