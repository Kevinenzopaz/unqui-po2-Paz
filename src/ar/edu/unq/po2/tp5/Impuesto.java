package ar.edu.unq.po2.tp5;
import ar.edu.unq.po2.tp5.interfaces.*;

public class Impuesto extends Factura {
    private double tasaFija;

    public Impuesto(double tasaFija, Agencia agencia) { //constructor
        super(agencia);
        this.tasaFija = tasaFija;
    }

    @Override
    public double getMontoAPagar() {
        return tasaFija;
    }
}
