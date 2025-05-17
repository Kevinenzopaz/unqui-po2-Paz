package ar.edu.unq.po2.tp7.composite;

import ar.edu.unq.po2.tp7.composite.interfaces.*;

public class Soja implements Parcela {
    @Override
    public double calcularGanancia() {
        return 500;
    }
}
