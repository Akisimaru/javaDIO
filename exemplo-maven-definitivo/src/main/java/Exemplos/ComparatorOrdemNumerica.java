package Exemplos;

import java.util.Comparator;
import java.util.Map;

class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    ComparatorOrdemNumerica() {
    }

    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(((Contato)cont1.getValue()).getNumero(), ((Contato)cont2.getValue()).getNumero());
    }
}
