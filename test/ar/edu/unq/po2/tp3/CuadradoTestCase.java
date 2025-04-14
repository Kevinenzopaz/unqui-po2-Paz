package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CuadradoTestCase {

    private Cuadrado cuadrado;

    @BeforeEach
    public void setUp() {
        cuadrado = new Cuadrado(new Punto(2, 2), 4);
    }

    // ---------- Tests para Cuadrado ----------

    @Test
    public void testAreaCuadrado() {
        assertEquals(16, cuadrado.area());
    }

    @Test
    public void testPerimetroCuadrado() {
        assertEquals(16, cuadrado.perimetro());
    }

    @Test
    public void testLadoCuadrado() {
        assertEquals(4, cuadrado.getLado());
    }

    @Test
    public void testOrientacionCuadrado() {
        assertFalse(cuadrado.esHorizontal());
        assertFalse(cuadrado.esVertical());
    }
}