package ar.edu.unq.po2.tp5;

public abstract class Producto {
    protected String nombre;
    protected double precioBase;
    protected int stock;

    public Producto(String nombre, double precioBase, int stock) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    public abstract double getPrecio();

    public void decrementarStock() {
        if (this.hayStock()) {
            this.stock--;
        }
    }
    
    public int getStock() {
    	return this.stock;
    }

    public boolean hayStock() {
        return this.stock > 0;
    }
}
