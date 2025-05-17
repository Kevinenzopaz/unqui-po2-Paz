package ar.edu.unq.po2.tp7.composite;

import ar.edu.unq.po2.tp7.composite.interfaces.*;

import java.util.*;

public class ParcelaMixta implements Parcela {
    private List<Parcela> subParcelas = new ArrayList<>();

    public void agregarParcela(Parcela p) {
        subParcelas.add(p);
    }

    public void eliminarParcela(Parcela p) {
        subParcelas.remove(p);
    }

    @Override
    public double calcularGanancia() {
        return subParcelas.stream()
                          .mapToDouble(Parcela::calcularGanancia)
                          .sum() / 4;
    }
}
