package ar.edu.unq.po2.tp4;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {

    private Trabajador trabajador;

    @BeforeEach
    public void setUp() {
        trabajador = new Trabajador();

        // Ingresos comunes
        trabajador.agregarIngreso(new Ingreso(1, "Sueldo Enero", 100000));
        trabajador.agregarIngreso(new Ingreso(2, "Sueldo Febrero", 100000));

        // Ingreso por horas extras (exento)
        trabajador.agregarIngreso(new IngresoPorHorasExtra(3, "Horas Extra", 20000, 10));
    }

    @Test
    public void testTotalPercibido() {
        assertEquals(220000, trabajador.getTotalPercibido());
    }

    @Test
    public void testMontoImponible() {
        // Solo los ingresos comunes suman al monto imponible
        assertEquals(200000, trabajador.getMontoImponible());
    }

    @Test
    public void testImpuestoAPagar() {
        // 2% del monto imponible (200000)
        assertEquals(4000, trabajador.getImpuestoAPagar());
    }
}