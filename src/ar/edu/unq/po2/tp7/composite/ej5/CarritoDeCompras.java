package ar.edu.unq.po2.tp7.composite.ej5;

import java.util.List;

public class CarritoDeCompras {
    private List<Product> products;

    private void setElements(List<Product> products) {
        this.products = products;
    }

    public List<Product> getElements() {
        return this.products;
    }

    public float total() {
        return products.stream().map(Product::getPrice).reduce(0f, Float::sum);
    }

    public int totalRounded() {
        return Math.round(this.total());
    }
}
//products.stream() transforma la lista products (que es un List<Product>) en un Stream
//.map(Product::getPrice) transforma cada elemento del stream en su precio float
//.reduce(0f, Float::sum) acumula todos los elementos del stream en un solo valor.
// 0f → es el valor inicial (la suma arranca desde cero) usamos 0f porque es un literal de tipo float
// Float::sum → es la operación que se usa para acumular (sumar precios)