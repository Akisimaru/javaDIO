package Exemplos;

import java.util.Comparator;
import java.util.Map;

class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
    ComparatorOrdemNomeContato() {
    }

    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return ((Contato)cont1.getValue()).getNome().compareToIgnoreCase(((Contato)cont2.getValue()).getNome());
    }
}
