package Exemplos;

import java.util.*;

public class OrdemMap {


    public static void main(String[] args){

        Map<String,Livros> myBooks = new HashMap<>(){{
            put("Hawking, Stephen", new Livros("Historia tempo",2));
            put("Hawking, King", new Livros("Historia a mais tempo",3));
            put("King, Stephen", new Livros("Historia sem tempo",1));
            put("Suus, Amogus", new Livros("Histerioa",1234));
            put("Amogus, Soos", new Livros("Temp",7));

        }};


        for(Map.Entry<String, Livros> myLivros: myBooks.entrySet()){
            System.out.println(myLivros.getKey() + " - " + myLivros.getValue().getNome());
        }

        System.out.println("-------------------------------------------------------");

        Map<String,Livros> myBooks2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livros("Historia tempo",2));
            put("Hawking, King", new Livros("Historia a mais tempo",3));
            put("King, Stephen", new Livros("Historia sem tempo",1));
            put("Suus, Amogus", new Livros("Histerioa",1234));
            put("Amogus, Soos", new Livros("Temp",7));

        }};


        for(Map.Entry<String, Livros> myLivros: myBooks2.entrySet()){
            System.out.println(myLivros.getKey() + " - " + myLivros.getValue().getNome());
        }


        System.out.println("-------------------------------------------------------");

        Map<String,Livros> myBooks3 = new TreeMap<>(myBooks2);


        for(Map.Entry<String, Livros> myLivros: myBooks3.entrySet()){
            System.out.println(myLivros.getKey() + " - " + myLivros.getValue().getNome());
        }


        System.out.println("-------------------------------------------------------");

        Set<Map.Entry<String, Livros>> myBooks4 = new TreeSet<>(new ComparatorNome());
        myBooks4.addAll(myBooks3.entrySet());

        for(Map.Entry<String, Livros> myLivros: myBooks4){
            System.out.println(myLivros.getKey() + " - " + myLivros.getValue().getNome());
        }

    }
}

class Livros{
    private String nome;
    private Integer paginas;

    public Livros(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return nome.equals(livros.nome) && paginas.equals(livros.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return " Livros - |" +
                "nome= '" + nome + '\'' +
                ", paginas= " + paginas +
                " | \n";
    }
}


class ComparatorNome implements Comparator<Map.Entry<String, Livros>>{


    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getNome().compareTo(l2.getValue().getNome());
    }
}