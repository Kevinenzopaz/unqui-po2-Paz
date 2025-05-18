package ar.edu.unq.po2.tp7.composite.warcraft;
import ar.edu.unq.po2.tp3.Punto;

public class PuntoMapa extends Punto {
	private boolean tieneLaja;

    public PuntoMapa(int x, int y) {
        super(x, y);
        this.tieneLaja = false;
    }

    public PuntoMapa(int x, int y, boolean valor) {
        super(x, y);
        this.tieneLaja = valor;
    }

    public boolean getTieneLaja() {
        return tieneLaja;
    }

    public void setTieneLaja(boolean valor) {
        this.tieneLaja = valor;
    }

}
