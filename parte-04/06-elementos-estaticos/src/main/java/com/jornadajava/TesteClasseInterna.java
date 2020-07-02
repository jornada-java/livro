package com.jornadajava;

public class TesteClasseInterna {
    public static void main(String args[]) {

        // Criando uma instância da ClasseInternaEstatica
        ClasseExterna.ClasseInternaEstatica ex1
                = new ClasseExterna.ClasseInternaEstatica();

        // Para criar uma instância da ClasseInterna, é necessário criar primeiro uma instância da ClasseExterna
        ClasseExterna ex2 = new ClasseExterna();
        ClasseExterna.ClasseInterna ex3
                = ex2.new ClasseInterna();

        // Outra forma de criar uma instância da InnerClass
        ClasseExterna.ClasseInterna ex4
                = new ClasseExterna().new ClasseInterna();
    }
}
