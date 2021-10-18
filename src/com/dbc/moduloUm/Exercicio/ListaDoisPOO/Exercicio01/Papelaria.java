package com.dbc.Exercicio.ListaDoisPOO.Exercicio01;

public class Papelaria {
    private String produto;
    private float valorProduto;

    Papelaria(String produto, float valorProduto){
        this.produto = produto;
        this.valorProduto = valorProduto;
    }

    public void calculaDescontos(){
        System.out.printf("Nome produto: %s\n", this.produto);
        for(int i = 1; i <= 10; i++){
            float promocao = this.valorProduto - ((valorProduto * (i * 5)) / 100);
            System.out.printf("%s x R$ %.2f = R$ %.2f\n",
                    i, promocao, promocao * i);

        }
    }

}
