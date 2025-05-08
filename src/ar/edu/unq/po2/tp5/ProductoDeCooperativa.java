package ar.edu.unq.po2.tp5;

public class ProductoDeCooperativa extends Producto {

    public ProductoDeCooperativa(String nombre, double precioBase, int stock) {
        super(nombre, precioBase, stock);
    }

    @Override
    public double getPrecio() {
        return this.precioBase * 0.9; // Aplica 10% de descuento
    }
}