package Exemplos.avancado;

public class FuncaoAltaOrdem {
    public static void main (String[] args){
        Calculo soma = ( a, b ) -> a+b;
        Calculo sub = ( a, b ) -> a-b;
        Calculo div = ( a, b ) -> a/b;
        Calculo mult = ( a, b ) -> a*b;


        System.out.println(executarOperacao(soma,1,3));
        System.out.println(executarOperacao(sub,4,3));
        System.out.println(executarOperacao(div,4,2));
        System.out.println(executarOperacao(mult,7,3));

    }



    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calculo(a,b);
    }



}


interface Calculo {
    public int calculo(int a, int b);
}