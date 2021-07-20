package Exemplos.avancado.paralelia;

import java.util.stream.IntStream;

public class PararelaStreamas {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(num -> fatorial(num));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - inicio));



        inicio = System.currentTimeMillis();
        IntStream.range(1,100000).parallel().forEach(num -> fatorial(num));
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - inicio));


    }


   public static long fatorial(long num){
        int fat = 1;

        for (int i = 2; i <= num; i++){
            fat*= i;

        }
        return fat;
    }
}
