package Exemplos.avancado;

import java.util.function.Consumer;
import java.util.function.Function;

public class Funcos {
    public static void main(String[] args){
        Function<String,String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String,Integer> retornarNomeInteiroeCalculaODobro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornarNomeAoContrario.apply("sugomA"));
        System.out.println(retornarNomeInteiroeCalculaODobro.apply("80"));
    }
}
