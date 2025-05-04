package ar.edu.unq.po2.tp4;

public class Producto {
	protected String nombre;
	protected double precio;
	protected boolean preciosCuidados;
	
	public Producto(String nombre, double precio, boolean preciosCuidados) {
        this.nombre = nombre;
        this.precio = precio;
        this.preciosCuidados = preciosCuidados;
    }

    public Producto(String nombre, double precio) {
        this(nombre, precio, false);
    }
	
	public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esPrecioCuidado() {
        return preciosCuidados;
    }
    
    public void aumentarPrecio(double cantAAumentar) {
		this.precio = precio + cantAAumentar;
	}
}
