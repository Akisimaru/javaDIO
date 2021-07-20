package Exemplos.avancado;

import java.util.function.Consumer;

public class SuppliersDoJava {
    public static void main(String[] args){




        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");
        imprimirUmaFrase2.accept("Bye World");
    }
}
