package com.dbc.Exercicio.ListaUmPOO.Exercicio04;

public class Estados {
    private String[] estados = {"Rio Grande do Sul", "São Paulo", "Rio Janeiro"};
    private String[][] cidades = {
            {"Porto Alegre", "Viamão"},
            {"São Paulo", "Campinas"},
            {"Rio de janeiro", "Niterói"}
    };
    private String[][] populacao = {
            {"1.400.000", "500.000"},
            {"12.000.000", "8.000.000"},
            {"6.000.000", "2.000.000"},
    };
    private String[][] pontosTuristicos = {
            {"Mercadão", "Parque das águas"},
            {"Avenida Paulista", "Pedreira do Chapadão"},
            {"Cristo", "Ponto Rio-Niterói"}
    };


    Estados(){}

    public void menuEstados(){
        System.out.println("Index       Estados:");
        for(int i = 0; i < estados.length; i++){
            System.out.printf("%s           %s\n", i, estados[i]);
        }
    }
    public void menuCidade(int index){
        System.out.println("Index       Cidade:");
        for (int i = 0; i < cidades[index].length; i++){
            System.out.printf("%s           %s\n", i , cidades[index][i]);
        }
    }

    public void menuCidadeConteudo(int indexEstado, int indexCidade){
        System.out.printf("Cidade: %s\nPopulação: %s\nPonto Turistico: %s\n",
                cidades[indexEstado][indexCidade], populacao[indexEstado][indexCidade],
                pontosTuristicos[indexEstado][indexCidade]);
    }

    public int getEstadosTamanho() {
        return estados.length;
    }

    public int getCidadeTamanho(int i){
        return cidades[i].length;
    }



}
