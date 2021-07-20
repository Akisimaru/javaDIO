package exercicios.ex2;

import exercicios.ex1.Carro;

public class Teste2 {

        public static void main (String[] args){
            Carro2 carro = new Carro2( "gol", "poot", 2018);

            System.out.println("Marca: " + carro.getMarca());
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Ano: " + carro.getAno());
            carro.setVariante("azul");
            System.out.println("Variante: " + carro.getVariante());




        }

    }


