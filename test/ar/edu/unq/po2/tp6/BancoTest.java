package ar.edu.unq.po2.tp6;

import ar.edu.unq.po2.tp6.banco.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class BancoTest {

    private Banco banco;
    private Cliente cliente;
    private Propiedad propiedad;

    @BeforeEach
    public void setUp() { //creamos el banco, la propiedad y el cliente
        banco = new Banco();
        propiedad = new Propiedad("Depto", "Calle Falsa 123", 100000);
        cliente = new Cliente("Juan", "Pérez", "Calle Falsa", 30, 3000);
        
        cliente.agregarPropiedad(propiedad); // le agregamos la propiedad al cliente y este al banco
        banco.agregarCliente(cliente);
    }

    @Test
    public void testSolicitudCreditoPersonalAceptada() {
        SolicitudDeCredito s = new SolicitudCreditoPersonal(cliente, 6000, 6); // Cuota = 1000, 70% sueldo = 2100

        banco.registrarSolicitud(s);
        banco.evaluarSolicitud(s);

        assertEquals(6000, banco.montoTotalADesembolsar());
        assertTrue(banco.getSolicitudesAceptadas().contains(s));
    }

    @Test
    public void testSolicitudCreditoHipotecarioNoAceptada() {
        SolicitudDeCredito s = new SolicitudCreditoHipotecario(cliente, 80000, 12, propiedad); // Cuota = 6666.66 > 1500

        banco.registrarSolicitud(s);
        banco.evaluarSolicitud(s);

        assertEquals(0, banco.montoTotalADesembolsar());
        assertFalse(banco.getSolicitudesAceptadas().contains(s));
    }
}
