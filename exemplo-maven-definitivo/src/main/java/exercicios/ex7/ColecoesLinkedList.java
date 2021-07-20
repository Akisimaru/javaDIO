package exercicios.ex7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ColecoesLinkedList {


    public static void main(String[] args){
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


        // Crie uma lista notas2, coloque todos os elementos do arrayList nessa lista
        // Mostre a primeira nota sem remove-la
        //Mostre a primeira nota removendo-a

        LinkedList<Double> notas2 = new LinkedList<>();
        Iterator<Double> iterator = notas.iterator();

        while (iterator.hasNext()){
            double next = iterator.next();
            notas2.add(next);

        }

        System.out.println("Notas 2: " + notas2.toString());

        System.out.println("Primeira Notas 2: " + notas2.getFirst());
        System.out.println("Ate mais notas 2: " + notas2.pollFirst());
        System.out.println("Notas 2: " + notas2.toString());

    }
}
