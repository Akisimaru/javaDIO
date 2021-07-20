package br.com.digital.innovation.one;

import java.util.function.Function;

public class InterferenciaLambda {

    public static void main(String[] args) {
        Function<Integer, Double> divisaoPor2 = (var numero) -> numero / 2d;

        System.out.println(divisaoPor2.apply(3));



    }
}
