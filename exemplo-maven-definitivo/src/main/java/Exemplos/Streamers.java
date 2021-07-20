package Exemplos;

import java.io.PrintStream;
import java.util.*;
import java.util.function.Function;

public class Streamers {
    public static void main(String[] args){

        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            this.put(1, new Contato("Simba", 5555));
            this.put(4, new Contato("Cami", 1111));
            this.put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda);
        Iterator var2 = agenda.entrySet().iterator();

        PrintStream var10000;
        Object var10001;
        while(var2.hasNext()) {
            Map.Entry<Integer, Contato> entry = (Map.Entry)var2.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + ((Contato)entry.getValue()).getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>(){{
            this.put(1, new Contato("Simba", 5555));
            this.put(4, new Contato("Cami", 1111));
            this.put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda1);
        Iterator var9 = agenda1.entrySet().iterator();

        while(var9.hasNext()) {
            Map.Entry<Integer, Contato> entry = (Map.Entry)var9.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + ((Contato)entry.getValue()).getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap(agenda);
        System.out.println(agenda2);
        Iterator var11 = agenda2.entrySet().iterator();

        while(var11.hasNext()) {
            Map.Entry<Integer, Contato> entry = (Map.Entry)var11.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + ((Contato)entry.getValue()).getNome());
        }

        System.out.println("--\tOrdem número telefone\t--");
       /* Set<Map.Entry<Integer, Contato>> set = new TreeSet(new ComparatorOrdemNumerica());

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {

            @Override
            public Integer apply(Map.Entry<Integer, Contato> cont) {
                return cont.getValue().getNumero();
            }
        }));*/
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing( cont -> cont.getValue().getNumero()));

        set.addAll(agenda.entrySet());
        Iterator var13 = set.iterator();

        while(var13.hasNext()) {
            Map.Entry<Integer, Contato> entry = (Map.Entry)var13.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + ((Contato)entry.getValue()).getNumero() + ": " + ((Contato)entry.getValue()).getNome());
        }

        System.out.println("--\tOrdem nome contato\t--");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet(new ComparatorOrdemNomeContato());
        set1.addAll(agenda.entrySet());
        Iterator var15 = set1.iterator();

        while(var15.hasNext()) {
            Map.Entry<Integer, Contato> entry = (Map.Entry)var15.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + ((Contato)entry.getValue()).getNome());
        }




    }



}
