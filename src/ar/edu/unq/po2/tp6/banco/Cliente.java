package ar.edu.unq.po2.tp6.banco;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private double sueldoMensual;
    private List<Propiedad> propiedades;

    public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoMensual) {
        this(nombre, apellido, direccion, edad, sueldoMensual, new ArrayList<>());
    }

    public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoMensual, List<Propiedad> propiedades) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.sueldoMensual = sueldoMensual;
        this.propiedades = propiedades;
    }

    public double getSueldoMensual() { 
    	return sueldoMensual; 
    }
    
    public double getSueldoAnual()   { 
    	return sueldoMensual * 12; 
    }
    
    public int getEdad()            { 
    	return edad; 
    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void agregarPropiedad(Propiedad p) {
        propiedades.add(p);
    }
}
