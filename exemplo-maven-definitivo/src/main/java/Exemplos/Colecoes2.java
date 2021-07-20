package Exemplos;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Colecoes2 {
    public static void main(String[] args){
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato ("Jon", 18, "preto"));
            add(new Gato ("Simba", 6, "tigrado"));
            add(new Gato ("Jon", 12, "amarelo"));
        }};



        System.out.println(gatos);
        Collections.shuffle(gatos);
        System.out.println(gatos);

        Collections.sort(gatos);
        System.out.println(gatos);

        Collections.sort(gatos,new ComparatorIdade());
        System.out.println(gatos);

        Collections.sort(gatos,new ComparatorCor());
        System.out.println(gatos);

        Collections.sort(gatos,new ComparatorNomeCorIdade());
        System.out.println(gatos);


    }


}

class Gato implements Comparable<Gato>{
    private String nome;
    private int idade;
    private String cor;

    public Gato (String nome, int idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{


    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{


    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        int idade = Integer.compare(g1.getIdade(), g2.getIdade());
        if (nome != 0){
            return nome;
        }
        else if(cor != 0){
            return cor;
        }
        else {
            return idade;
        }
    }
}