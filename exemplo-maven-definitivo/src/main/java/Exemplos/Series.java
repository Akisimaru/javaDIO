package Exemplos;

import java.util.Comparator;
import java.util.Objects;

public class Series implements Comparable<Series>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Series(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Series{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return nome.equals(series.nome) && genero.equals(series.genero) && tempoEpisodio.equals(series.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Series series) {
        int tempoEpisode = Integer.compare(this.getTempoEpisodio(), series.getTempoEpisodio());



        if (tempoEpisode != 0) {
            return tempoEpisode;
        }

        return  this.getGenero().compareToIgnoreCase(series.getGenero());
    }

}

class ComparadorNomeGeneroTempoEpisodio implements Comparator<Series>{

    @Override
    public int compare(Series s1, Series s2) {
        int tempoEpisode = Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
        int nome = s1.getNome().compareToIgnoreCase(s2.getNome());

        if (nome != 0) return nome;

        if (genero != 0) return genero;

        return tempoEpisode;
    }
}
