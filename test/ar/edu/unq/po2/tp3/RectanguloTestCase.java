package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class RectanguloTestCase {

    private Rectangulo rectangulo;

    @BeforeEach
    public void setUp() {
        rectangulo = new Rectangulo(new Punto(0, 0), 10, 5);
    }

    // ---------- Tests para Rectangulo ----------

    @Test
    public void testAreaRectangulo() {
        assertEquals(50, rectangulo.area());
    }

    @Test
    public void testPerimetroRectangulo() {
        assertEquals(30, rectangulo.perimetro());
    }

    @Test
    public void testOrientacionRectangulo() {
        assertTrue(rectangulo.esHorizontal());
        assertFalse(rectangulo.esVertical());
    }
}