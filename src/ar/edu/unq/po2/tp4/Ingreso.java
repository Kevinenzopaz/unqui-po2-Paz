package ar.edu.unq.po2.tp4;

public class Ingreso {
    private int mes;
    private String concepto;
    private double montoPercibido;

    public Ingreso(int mes, String concepto, double montoPercibido) {
        this.mes = mes;
        this.concepto = concepto;
        this.montoPercibido = montoPercibido;
    }

    public double getMontoPercibido() {
        return montoPercibido;
    }

    public double getMontoImponible() { //Para un ingreso, el monto imponible al Impuesto al Trabajador es igual al monto percibido
        return montoPercibido;
    }
}
