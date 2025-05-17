package ar.edu.unq.po2.tp6.banco;

public class SolicitudCreditoPersonal extends SolicitudDeCredito {

    public SolicitudCreditoPersonal(Cliente cliente, double monto, int plazo) {
        super(cliente, monto, plazo);
    }

    @Override
    public boolean esAceptable() {
        return cliente.getSueldoAnual() >= 15000 &&
               cuotaMensual() <= cliente.getSueldoMensual() * 0.7;
    }
}
