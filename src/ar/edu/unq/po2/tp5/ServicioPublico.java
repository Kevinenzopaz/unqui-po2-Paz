package ar.edu.unq.po2.tp5;
import ar.edu.unq.po2.tp5.interfaces.*;

public class ServicioPublico extends Factura {
    private double costoUnitario;
    private int unidadesConsumidas;

    public ServicioPublico(double costoUnitario, int unidadesConsumidas, Agencia agencia) { //constructor
        super(agencia);
        this.costoUnitario = costoUnitario;
        this.unidadesConsumidas = unidadesConsumidas;
    }

    @Override
    public double getMontoAPagar() {
        return costoUnitario * unidadesConsumidas;
    }
}