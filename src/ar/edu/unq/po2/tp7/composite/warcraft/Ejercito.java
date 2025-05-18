package ar.edu.unq.po2.tp7.composite.warcraft;

import ar.edu.unq.po2.tp7.composite.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Ejercito implements Personaje {

    private List<Personaje> miembros;
    
    //constructor 
    public Ejercito() {
        this.miembros = new ArrayList<>();
    }

    public void agregar(Personaje personaje) {
        miembros.add(personaje);
    }

    public void eliminar(Personaje personaje) {
        miembros.remove(personaje);
    }

    @Override
    public void caminarA(PuntoMapa destino) {   //hace caminar a cada personaje del ejercito, estos caminaran de la forma que les corresponda a cada uno
        for (Personaje personaje : miembros) {
            personaje.caminarA(destino);
        }
    }
}
