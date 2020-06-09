public class Retangulo implements EspacoFigura {
    //implementamos a interface EspacoFigura na classe retângulo 

    private int lado1;
    private int lado2;
    private int lado3;
    private int lado4;

    //geters e setters para todos os atributos
    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public int getLado4() {
        return lado4;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public void setLado4(int lado4) {
        this.lado4 = lado4;
    }

    //Lembra do método getPerimetro da nossa interface?
    //Aqui fazemos override nele para fazer o cálculo do perímetro do nosso retângulo
    @Override
    public int getPerimetro() {
        int perimetro = 0;
        perimetro = lado1 + lado2 + lado3 + lado4;

        return perimetro;
    }

}
