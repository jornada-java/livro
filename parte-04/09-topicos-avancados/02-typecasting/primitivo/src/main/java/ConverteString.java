public class ConverteString {

    public static void main(String[] args) {
        Integer meuInteiroReferencia = 0;
        String minhaNovaString = meuInteiroReferencia.toString();

        boolean meuBoolean = Boolean.parseBoolean(minhaNovaString);
        float meuFloat = Float.parseFloat(minhaNovaString);
        int meuInteiro = Integer.parseInt(minhaNovaString);
        short meuShort = Short.parseShort(minhaNovaString);
        long meuLong = Long.parseLong(minhaNovaString);
        double meuDouble = Double.parseDouble(minhaNovaString);
        byte meuByte = Byte.parseByte(minhaNovaString);
        char meuChar = minhaNovaString.charAt(0);
    }

}
