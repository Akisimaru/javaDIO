package exercicios.ex1;

import exercicios.ex1.Carro;

public class Teste {
    public static void main (String[] args){
            Carro carro = new Carro();

            System.out.println("Quantidade de passageiros: " + carro.getPassageiros());

            System.out.println("Quantidade de passageiros: " + carro.colocarNovoPassageiro());

            System.out.println("Quantidade de passageiros: " + carro.tirarPassageiro());



    }

}
