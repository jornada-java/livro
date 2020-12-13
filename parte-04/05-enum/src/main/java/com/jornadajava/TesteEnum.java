package com.jornadajava;

public class TesteEnum {

    public static void main(String[] args) {

        SituacaoPedido situacaoPedido = SituacaoPedido.SOLICITADO;

        switch (situacaoPedido) {
            case SOLICITADO:
                System.out.println("Pedido solicitado.");
                break;
            case ENVIADO:
                System.out.println("Pedido enviado.");
                break;
            case EM_PREPARACAO:
                System.out.println("Pedido em preparação.");
                break;
            case ENTREGUE:
                System.out.println("Pedido entregue.");
                break;
            default:
                System.out.println("Situação do pedido desconhecida.");
                break;
        }
    }

}
