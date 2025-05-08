package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
    private double total = 0;
    private List<Producto> productosRegistrados;
    
    public Caja() { //constructor
        productosRegistrados = new ArrayList<>(); // Inicialización 
    }

    public void registrar(Producto producto) {
        if (producto.hayStock()) {
            total += producto.getPrecio();
            producto.decrementarStock();
            productosRegistrados.add(producto); // Se guarda el producto registrado
        }
    }

    public double getMontoTotal() {
        return total;
    }

    public List<Producto> getProductosRegistrados() {
        return productosRegistrados;
    }
}
