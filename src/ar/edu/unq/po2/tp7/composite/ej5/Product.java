package ar.edu.unq.po2.tp7.composite.ej5;

public class Product {
	
	protected float price;
	
	protected String name;
	
	public Product(float price, String name) {
        this.price = price;
        this.name = name;
    }//no estaba en el uml consultar luego 
	
	public float getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}
}