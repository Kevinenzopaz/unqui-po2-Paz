package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import ar.edu.unq.po2.tp5.interfaces.*;

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
    
    //metodo punto 2 para facturas y servicios
    public void registrar(Cobrable item) {
        total += item.getMontoAPagar();

        if (item instanceof Factura) { // podemos omitirlo si estamos seguros de que solo le pasaremos facturas o servicios, pero queda mas robusto para el futuro
            ((Factura) item).registrarPago();
        }// sin el if puede tirar ClassCastException si cambiamos Cobrable, si en un futuro hacemos que producto implemente cobrable esto seguira funcionando
    }
    
    public double getMontoTotal() {
        return total;
    }

    public List<Producto> getProductosRegistrados() {
        return productosRegistrados;
    }
}
