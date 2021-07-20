package Exemplos.avancado;

import java.util.function.UnaryOperator;

public class exemplo1 {

    public static void main(String[] args){
        UnaryOperator<Integer> calcularPor3 = valor -> valor * 3;
        int valor = 10;
        System.out.println(valor + " x 3 = " + calcularPor3.apply(valor));

    }
}
