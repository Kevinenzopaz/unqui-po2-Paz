package ar.edu.unq.po2.tp5;

public class ProductoEmpresa extends Producto {

    public ProductoEmpresa(String nombre, double precioBase, int stock) {
        super(nombre, precioBase, stock);
    }

    @Override
    public double getPrecio() {
        return this.precioBase; // No aplica descuento
    }
}