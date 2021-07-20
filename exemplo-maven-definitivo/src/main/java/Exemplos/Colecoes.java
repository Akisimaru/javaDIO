package Exemplos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Colecoes {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(6d);
        notas.add(8d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);




        System.out.println("Notas: " + notas.toString());

        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()){
            double next = iterator.next();
            soma += next;

        }
        System.out.println("Soma: " + soma);

        System.out.println("Media: " + soma / notas.size());

        notas.remove(0d);


        System.out.println("Notas: " + notas.toString());


        System.out.println("Notas: " + notas.toString());
        Iterator<Double> iterator2 = notas.iterator();

        while (iterator2.hasNext()){
            double next = iterator2.next();
            if (next < 7) iterator2.remove();

        }
        System.out.println("Notas: " + notas.toString());

        notas.clear();
        System.out.println("Notas: " + notas.toString());




        System.out.println("Notas esta vazia? " + notas.isEmpty());


    }}
