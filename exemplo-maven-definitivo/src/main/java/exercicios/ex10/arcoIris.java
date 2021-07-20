package exercicios.ex10;


import Exemplos.Series;

import java.util.*;

public class arcoIris {
    public static void main(String[] args) {


        Set<String> arcoCores = new HashSet<>(){{
            add(new String("Azul"));
            add(new String("Amarelo"));
            add(new String("Branco"));
            add(new String("Preto"));
            add(new String("Verde"));
            add(new String("Vermelho"));
            add(new String("Laranja"));
            add(new String("Laranja"));
            add(new String("Roxo"));
        }};
        for (String arcoIris: arcoCores) {
            System.out.println(arcoIris);
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("Atualmente existem: " + arcoCores.size() + " cores");

        System.out.println("----------------------------------------------------------");
        Set<ArcoCores> arcoCores1 = new TreeSet<>(){{
            add(new ArcoCores("Azul"));
            add(new ArcoCores("Amarelo"));
            add(new ArcoCores("Branco"));
            add(new ArcoCores("Preto"));
            add(new ArcoCores("Verde"));
            add(new ArcoCores("Vermelho"));
            add(new ArcoCores("Laranja"));
            add(new ArcoCores("Roxo"));
        }};

        for (ArcoCores arcoIris: arcoCores1) {
            System.out.println(arcoIris.getCor());
        }

        System.out.println("----------------------------------------------------------");
        List<ArcoCores> arcoCores3 = new ArrayList<>(){{
            add(new ArcoCores("Azul"));
            add(new ArcoCores("Amarelo"));
            add(new ArcoCores("Branco"));
            add(new ArcoCores("Preto"));
            add(new ArcoCores("Verde"));
            add(new ArcoCores("Vermelho"));
            add(new ArcoCores("Laranja"));
            add(new ArcoCores("Roxo"));
        }};
        Collections.reverse(arcoCores3);
        for (ArcoCores arcoIris: arcoCores3) {
            System.out.println(arcoIris.getCor());
        }


        System.out.println("----------------------------------------------------------");

        System.out.println("Atualmente existem: " + arcoCores.size() + " cores");

        System.out.println("----------------------------------------------------------");


    }



}


class ArcoCores implements Comparable<ArcoCores>{
    private String cor;

    public ArcoCores(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "|" +
                "cor='" + cor + '\'' +
                "|\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArcoCores arcoCores = (ArcoCores) o;
        return cor.equals(arcoCores.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor);
    }


    @Override
    public int compareTo(ArcoCores arcoCores) {
        return this.cor.compareTo(arcoCores.cor);
    }
}