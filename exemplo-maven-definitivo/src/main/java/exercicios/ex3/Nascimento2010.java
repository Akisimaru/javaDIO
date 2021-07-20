package exercicios.ex3;

import exercicios.ex2.Carro2;

import java.util.Date;

public class Nascimento2010 {

    public static void main (String[] args){

        Date nascimento = new Date(1006826400000L);
        Date objetivo = new Date(1273892400000L);
        int diferencatempo = nascimento.compareTo(objetivo);


        System.out.println("Ano: " + nascimento);
        System.out.println("Ano: " + objetivo);
        System.out.println("Ano: " + diferencatempo);


    }
}
