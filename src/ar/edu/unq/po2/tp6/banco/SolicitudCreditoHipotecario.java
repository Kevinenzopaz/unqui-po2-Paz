package ar.edu.unq.po2.tp6.banco;

public class SolicitudCreditoHipotecario extends SolicitudDeCredito {
    private Propiedad propiedad;

    public SolicitudCreditoHipotecario(Cliente cliente, double monto, int plazo, Propiedad propiedad) {
        super(cliente, monto, plazo);
        this.propiedad = propiedad;
    }

    @Override
    public boolean esAceptable() {
    	boolean edadValida  = cliente.getEdad() + (plazo / 12) <= 65;
        boolean cuotaValida = cuotaMensual() <= cliente.getSueldoMensual() * 0.5;
        boolean montoValido = monto <= propiedad.getValorFiscal() * 0.7;
        
        return edadValida && cuotaValida && montoValido;
    }
}
