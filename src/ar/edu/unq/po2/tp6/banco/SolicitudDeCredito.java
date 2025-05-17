package ar.edu.unq.po2.tp6.banco;

public abstract class SolicitudDeCredito {
    protected Cliente cliente;
    protected double monto;
    protected int plazo;

    public SolicitudDeCredito(Cliente cliente, double monto, int plazo) {
        this.cliente = cliente;
        this.monto = monto;
        this.plazo = plazo;
    }

    public double cuotaMensual() {
        return monto / plazo;
    }

    public abstract boolean esAceptable();

    public double getMonto() {
        return monto;
    }
}
