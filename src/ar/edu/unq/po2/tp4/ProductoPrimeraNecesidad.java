package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
    private double descuento; 

    public ProductoPrimeraNecesidad(String nombre,double precio,boolean estaEnPreciosCuidados) {
		super(nombre,precio,estaEnPreciosCuidados);
	}
	
	public ProductoPrimeraNecesidad(String nombre,double precio) {
		super(nombre,precio);
	}
	//constructor ejercicio 2
	public ProductoPrimeraNecesidad(String nombre,double precio,boolean estaEnPreciosCuidados, double descuento) {
		super(nombre,precio,estaEnPreciosCuidados);
		this.descuento = descuento;
	}

	public double getPrecio() {
		return this.precio - this.descuentoDePrecio();   
	}
	
	private double descuentoDePrecio() {
		return (precio * descuento) / 100;
	}
}