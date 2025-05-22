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
