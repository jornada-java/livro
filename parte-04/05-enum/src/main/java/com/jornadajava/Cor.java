package com.jornadajava;

import java.awt.Color;

public enum Cor {
    VERMELHO("FF0000"),
    VERDE("00FF00"),
    AZUL("0000FF");

    private Cor(String codigoHex) {
        this.codigoHex = codigoHex;
    }

    private final String codigoHex;

    public String getCodigoHex() {
        return codigoHex;
    }

    public Color getColor() {
        return Color.decode("0x" + this.getCodigoHex());
    }
}
