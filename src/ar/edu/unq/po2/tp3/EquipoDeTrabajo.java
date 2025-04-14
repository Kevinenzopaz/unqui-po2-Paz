package ar.edu.unq.po2.tp3;


import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
    private List<Persona> integrantes = new ArrayList<>();
    
    public EquipoDeTrabajo(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public List<Persona> getIntegrantes() {
        return integrantes;
    }


    public void agregarIntegrante(Persona persona) {
        integrantes.add(persona);
    }
    
    public double promedioEdad() {
        if (integrantes.isEmpty()) return 0;

        int suma = 0;
        for (Persona persona : integrantes) {
            suma += persona.getEdad();
        }
        return (double) suma / integrantes.size();
    }

}
