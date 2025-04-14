package ar.edu.unq.po2.tp3;

public class Punto {
	
	private int x;
    private int y;

    // 1. Constructor con parámetros
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 2. Constructor sin parámetros (por defecto en 0,0)
    public Punto() {
        this(0, 0);  // reutiliza el constructor de arriba
    }

    // 3. Mover el punto a otra posición
    public void moverA(int nuevoX, int nuevoY) {
        this.x = nuevoX;
        this.y = nuevoY;
    }

    // 4. Sumar con otro punto y retornar un nuevo punto
    public Punto sumar(Punto otroPunto) {
        return new Punto(this.x + otroPunto.x, this.y + otroPunto.y);
    }

    // Métodos getter para acceder a los valores de x e y
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Método para mostrar el punto como texto
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
