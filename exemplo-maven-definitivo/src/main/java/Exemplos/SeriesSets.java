package Exemplos;

import java.util.*;

public class SeriesSets {
    public static void main(String[] args) {



        Set<Series> mySeries = new HashSet<>(){{
            add(new Series("got","fantasia",60));
            add(new Series("dark","drama",60));
            add(new Series("the big bang theory","comedia",25));
        }};
        for (Series series: mySeries) {
            System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());
        }
        System.out.println("----------------------------------------------------------");

        Set<Series> mySeries1 = new LinkedHashSet<>(){{
            add(new Series("got","fantasia",60));
            add(new Series("dark","drama",60));
            add(new Series("the big bang theory","comedia",25));
        }};

        for (Series series: mySeries1) {
            System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());
        }
        System.out.println("----------------------------------------------------------");

        Set<Series> mySeries2 = new TreeSet<>(mySeries1);

        for (Series series: mySeries2) {
            System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());
        }

        System.out.println("----------------------------------------------------------");

        Set<Series> mySeries3 = new TreeSet<>(new ComparadorNomeGeneroTempoEpisodio());
        mySeries3.addAll(mySeries);
        for (Series series: mySeries3) {
            System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());
        }
    }
}
