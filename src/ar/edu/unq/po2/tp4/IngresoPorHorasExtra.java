package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtra extends Ingreso {
    private int horasExtras;

    public IngresoPorHorasExtra(int mes, String concepto, double montoPercibido, int horasExtras) {
        super(mes, concepto, montoPercibido);
        this.horasExtras = horasExtras;
    }

    @Override
    public double getMontoImponible() {
        return 0.0; // exento de impuestos
    }
}