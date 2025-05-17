package ar.edu.unq.po2.tp6.banco;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes = new ArrayList<>();
    private List<SolicitudDeCredito> solicitudesRegistradas = new ArrayList<>();
    private List<SolicitudDeCredito> solicitudesAceptadas = new ArrayList<>();

    public void agregarCliente(Cliente c) {
        clientes.add(c);
    }

    public void registrarSolicitud(SolicitudDeCredito s) {
        solicitudesRegistradas.add(s);
    }

    public void evaluarSolicitud(SolicitudDeCredito s) {
        if (s.esAceptable()) {
            solicitudesAceptadas.add(s);
        }
    }

    public double montoTotalADesembolsar() {
        return solicitudesAceptadas.stream()
                                   .mapToDouble(SolicitudDeCredito::getMonto)
                                   .sum();
    }

    public List<SolicitudDeCredito> getSolicitudesAceptadas() {
        return solicitudesAceptadas;
    }

    public List<SolicitudDeCredito> getSolicitudesRegistradas() {
        return solicitudesRegistradas;
    }
}
