package ar.edu.unq.po2.tp7.composite.warcraft;
import ar.edu.unq.po2.tp7.composite.interfaces.*;

public class Caballero implements Personaje {
    @Override
    public void caminarA(PuntoMapa destino) {
        // Movimiento zigzag simulado
        System.out.println("Caballero camina en zigzag hasta el punto" + destino);
    }
}
