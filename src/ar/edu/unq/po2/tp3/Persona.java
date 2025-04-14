package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nombre;
    private LocalDate fechaNacimiento;
    
    // Constructor
    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    // Método para calcular la edad
    public int getEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }
    
    // Método 2: menor que otra persona
    public boolean menorQue(Persona otraPersona) {
        return this.getEdad() < otraPersona.getEdad();
    }

    // Método 3: método de clase para crear Persona
    public static Persona crear(String nombre, LocalDate fechaNacimiento) {
        return new Persona(nombre, fechaNacimiento);
    }

}
