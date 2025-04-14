package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	private Punto origen;
	private int ancho;
	private int alto;
	
	// 1. Constructor
    public Rectangulo(Punto origen, int ancho, int alto) {
        if (ancho <= 0 || alto <= 0) {
            throw new IllegalArgumentException("El ancho y el alto deben ser positivos");
        }
        this.origen = origen;
        this.ancho = ancho;
        this.alto = alto;
    }

    // 2. Área
    public int area() {
        return getAncho() * getAlto();
    }

    // 3. Perímetro
    public int perimetro() {
        return 2 * (getAncho() + getAlto());
    }

    // 4. Orientación
    public boolean esHorizontal() {
        return getAncho() > getAlto();
    }

    public boolean esVertical() {
        return getAlto() > getAncho();
    }

    // Getters
    public Punto getOrigen() {
        return origen;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }
}
