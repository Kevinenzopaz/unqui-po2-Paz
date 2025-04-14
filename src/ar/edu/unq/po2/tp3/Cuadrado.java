package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {

    public Cuadrado(Punto origen, int lado) {
        super(origen, lado, lado); // llamamos al constructor de Rectangulo
    }

    public Cuadrado(int lado) {
        super(new Punto(0, 0), lado, lado); // por defecto, origen en (0, 0)
    }

    public int getLado() {
        return getAlto(); // o getAncho(), da igual porque son iguales
    }
}