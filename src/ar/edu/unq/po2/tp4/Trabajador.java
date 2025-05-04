package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
    private List<Ingreso> ingresos;

    public Trabajador() {
        this.ingresos = new ArrayList<>();
    }

    public void agregarIngreso(Ingreso ingreso) {
        this.ingresos.add(ingreso);
    }

    public double getTotalPercibido() {
        return ingresos.stream()
                       .mapToDouble(Ingreso::getMontoPercibido)
                       .sum();
    }

    public double getMontoImponible() {
        return ingresos.stream()
                       .mapToDouble(Ingreso::getMontoImponible)
                       .sum();
    }

    public double getImpuestoAPagar() {
        return this.getMontoImponible() * 0.02;
    }
}