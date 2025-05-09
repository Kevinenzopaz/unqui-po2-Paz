package ar.edu.unq.po2.tp5;
import ar.edu.unq.po2.tp5.interfaces.*;

public abstract class Factura implements Cobrable { //una clase abstracta de la que heredaran los servicios e impuestos
    protected Agencia agencia;

    public Factura(Agencia agencia) { //constructor
        this.agencia = agencia;
    }

    public void registrarPago() {
        agencia.registrarPago(this);
    }
}//es abstracta porque implementa cobrable, lo que obliga a los servicios e impuestos a definir getMontoAPagar
