package ar.edu.unq.po2.tp5;

import ar.edu.unq.po2.tp5.interfaces.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaConFacturasTest {

    private Caja caja;
    private Agencia agencia;
    private ServicioPublico luz;
    private Impuesto municipal;

    @BeforeEach
    public void setUp() {
        agencia = new MockAgencia();
        caja = new Caja();

        luz = new ServicioPublico(100.0, 3, agencia);   // $300
        municipal = new Impuesto(250.0, agencia);       // $250
    }

    @Test
    public void testCobroDeServicioPublico() {
        caja.registrar(luz);

        assertEquals(300.0, caja.getMontoTotal(), 0.01);
        assertTrue(((MockAgencia) agencia).fueNotificado());
    }

    @Test
    public void testCobroDeImpuesto() {
        caja.registrar(municipal);

        assertEquals(250.0, caja.getMontoTotal(), 0.01);
        assertTrue(((MockAgencia) agencia).fueNotificado());
    }
    //Podemos usar mockito para evitar hacerlo manualmente
    // Clase auxiliar para verificar que se llamó a registrarPago
    class MockAgencia implements Agencia { //implementamos Agencia para probar el metodo registrarPago
        private boolean notificado = false;

        @Override
        public void registrarPago(Factura factura) {
            notificado = true;
        }//lo sobreescribimos porque en la interfaz dada Agencia este no hace nada y necesitamos comprobar que fue registrado

        public boolean fueNotificado() {
            return notificado;
        }
    }
}
