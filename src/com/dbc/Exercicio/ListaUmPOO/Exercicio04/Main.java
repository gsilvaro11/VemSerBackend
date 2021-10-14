package com.dbc.Exercicio.ListaUmPOO.Exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Programa
        boolean loop = true;
        while (loop){
            Scanner scanner = new Scanner(System.in);
            Main main = new Main();
            Estados estados = new Estados();

            estados.menuEstados();
            System.out.println("\nDigite o index desejado:");
            int index = scanner.nextInt();

            if(index < estados.getEstadosTamanho() && index >= 0){
                while (true){
                    estados.menuCidade(index);
                    System.out.println("\nDigite o index desejado:");
                    int indexCidade = scanner.nextInt();
                    if (indexCidade < estados.getCidadeTamanho(index) && indexCidade >= 0){
                        estados.menuCidadeConteudo(index,indexCidade);
                        loop = false;
                        break;
                    }else {
                        loop = main.tratativaErro();
                    }
                }
            }else {
                loop = main.tratativaErro();
            }
        }

    }
    Scanner scanner = new Scanner(System.in);
    private boolean tratativaErro(){
        boolean aux = true;
        System.err.println("\nPor favor digite o index correto!...");
        System.out.println("Digite [999] para sair! ou [ok] para continuar");
        String sair = scanner.next();
        if(sair.equals("999")){
            aux = false;
        }
        return aux;
    }
}
