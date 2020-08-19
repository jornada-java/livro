public class ReduzindoConversoes {

    public static void main(String[] args) {
        double variavelDouble = 1.0;
        int outraVariavelInt = (int) variavelDouble;
        byte variavelByte = (byte) outraVariavelInt;
        String minhaNovaString = String.valueOf(outraVariavelInt);

        System.out.println(variavelDouble);
        System.out.println(outraVariavelInt);
        System.out.println(variavelByte);
        System.out.println(minhaNovaString);

    }

}
