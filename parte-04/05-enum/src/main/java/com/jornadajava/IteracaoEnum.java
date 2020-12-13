package com.jornadajava;

public class IteracaoEnum {

    public static void main(String[] args) {
        for (SituacaoPedido situacaoPedido : SituacaoPedido.values()) {
            System.out.println(situacaoPedido);
        }
    }
}
