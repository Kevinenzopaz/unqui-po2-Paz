package ar.edu.unq.po2.tp7.composite.ej5;

public class SpecialProduct extends Product {
	
	public SpecialProduct(float price, String name) {
        super(price, name);
    }//no estaba en el uml consultar luego 
	
	@Override
	public float getPrice() {
		return super.getPrice() * 3;
	}
}