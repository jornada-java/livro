package com.jornadacolaborativa;

public class Jogo {

    public boolean vitoriaUsuario(String escolhaUsuario, int numUsuario, int numComputador) {
        int soma = numUsuario + numComputador;
        int resultado = soma % 2;

        System.out.println("escolhaUsuario = " + escolhaUsuario);
        System.out.println("numUsuario = " + numUsuario);
        System.out.println("numComputador = " + numComputador);

        if (escolhaUsuario != null && escolhaUsuario.equals("par")) {
            return resultado == 0;
        } else {
            return resultado != 0;
        }
    }

    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        String escolhaUsuario = "par";
        int numComputador = 2;
        int numUsuario = 2;

        if (jogo.vitoriaUsuario(escolhaUsuario, numUsuario, numComputador)) {
            System.out.println("Vitória usuário!");
        } else {
            System.out.println("Vitória computador. Não deveria acontecer!");
        }
    }

    /**
     * Gera um numero aleatorio entre 1 e 5
     * @return int entre 1 e 5
     */
    private static int geraNumeroEntreUmECinco() {
        return (int) (1 + Math.random() * 5);
    }

}
