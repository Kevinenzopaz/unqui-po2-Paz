package ar.edu.unq.po2.tp7.composite.warcraft;

import ar.edu.unq.po2.tp7.composite.interfaces.*;
import java.util.ArrayList;
import java.util.List;

public class Ingeniero implements Personaje {
    private List<Laja> lajas;
    private PuntoMapa puntoActual;
    
    
    //constructor
    public Ingeniero(PuntoMapa posicionInicial, int cantidadLajas) {
        this.puntoActual = posicionInicial;
        this.lajas = new ArrayList<>();
        for (int i = 0; i < cantidadLajas; i++) { //lo hacemos hasta alcanzar la cantidad recibida como argumento por el parametro
        	lajas.add(new Laja()); //creamos y añadimos lajas a nuestra lista de lajas
        }
    }
    
    @Override
    public void caminarA(PuntoMapa destino) {
        while (noLLegueAMiDestino(destino)) {
            this.dejarLajaSiSePuede();
            this.avanzarHacia(destino);
        }
    } 
    
    private void avanzarHacia(PuntoMapa destino) { //nos movemos una posicion segun nos corresponda 
        int dx = Integer.compare(destino.getX(), puntoActual.getX()); //devuelve -1 si destino.getx esta a la izquierda de puntoactual.get x, +1 caso contrario
        int dy = Integer.compare(destino.getY(), puntoActual.getY()); //lo mismo aca, nos sirve para decidir la direccion a la que ir

        this.puntoActual = new PuntoMapa(puntoActual.getX() + dx, //suma el +1 o el -1 segun corresponda lo que hace que se mueva a la der o izq una vez
        		                         puntoActual.getY() + dy, 
        		                         this.puntoActual.getTieneLaja());
    }
    
    private boolean noLLegueAMiDestino(PuntoMapa destino) {
    	return !this.puntoActual.equals(destino);
    }
    
    private void dejarLajaSiSePuede() {
        if (this.validarDejarLaja()) {
            this.dejarLaja();
        }
    }
    
    private boolean validarDejarLaja() {
    	return !this.puntoActual.getTieneLaja() && !this.lajas.isEmpty(); //si no hay laja en el punto actual y tengo lajas para dejar 
    }

    private void dejarLaja() {
        this.puntoActual.setTieneLaja(true);
        this.lajas.remove(0);
    }
}
