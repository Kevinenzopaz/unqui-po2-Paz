package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;

public class CajaTestCase {

    private Caja caja;
    private Producto arroz;
    private Producto aceite;

    @BeforeEach
    public void setUp() {
        caja = new Caja();
        arroz = new ProductoDeCooperativa("Arroz", 100.0, 2);  // precio con 10% desc: 90
        aceite = new ProductoEmpresa("Aceite", 200.0, 1);       // precio sin desc: 200
    }

    @Test
    public void testRegistrarProductos() {
        caja.registrar(arroz);   // 90
        caja.registrar(aceite);  // 200
        caja.registrar(arroz);   // 90
        
        List<Producto> registrados = caja.getProductosRegistrados();
        assertEquals(3, registrados.size());
        assertTrue(registrados.contains(arroz));
        assertTrue(registrados.contains(aceite));
        
    }
    @Test
    public void testCalcularMonto() {
    	caja.registrar(arroz);   // 90
        caja.registrar(aceite);  // 200
        caja.registrar(arroz);   // 90

        assertEquals(380.0, caja.getMontoTotal(), 0.01);
    }
    @Test
    public void testStock() {
        assertTrue(arroz.hayStock()); 
        caja.registrar(arroz);
        assertEquals(1, arroz.getStock());
        caja.registrar(arroz);
        assertFalse(arroz.hayStock()); 
    }
}
    
