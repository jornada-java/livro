public class AmpliandoeReduzindoConversoesPrimitivas {

    byte meuByteMaisLargo = (byte) 130;   // 0b10000010 -126, 130 é a representação binária para 126
    // o que difere é a forma que o bit de sinal é interpretado

    char meuCharMaisLargo = (char) meuByteMaisLargo;
    int meuIntMaisLargo = meuCharMaisLargo;

    byte meuNovoByte = (byte) meuIntMaisLargo; // 0b10000010 -126

    char meuCharMaisLargo2 = 130;
    // 0b 00000000 10000010

    int meuIntMaisLargo2 = meuCharMaisLargo2;
    // 0b00000000 10000010 130

    byte meuSegundoNovoByte2 = (byte) meuIntMaisLargo2;
    // 0b10000010 -126
}

