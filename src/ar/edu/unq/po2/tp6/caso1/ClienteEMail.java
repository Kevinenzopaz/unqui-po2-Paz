package ar.edu.unq.po2.tp6.caso1;

import java.util.ArrayList;
import java.util.List;
//CLASE CLIENTE NUEVA, AL FINAL ESTA LA BASE

public class ClienteEMail {

    private IServidor servidor;
    private String nombreUsuario;
    private String passusuario;
    private List<Correo> inbox = new ArrayList<>();    // esto en uml es una asociacion por ejemplo cliente gestiona correos ->
    private List<Correo> borrados = new ArrayList<>();

    public ClienteEMail(IServidor servidor, String nombreUsuario, String passusuario) {
        this.servidor = servidor;
        this.nombreUsuario = nombreUsuario;
        this.passusuario = passusuario;
    }

    public void conectar() {
        servidor.conectar(nombreUsuario, passusuario);
    }

    public void recibirNuevos() {
        List<Correo> nuevos = servidor.recibirNuevos(nombreUsuario, passusuario);
        inbox.addAll(nuevos);
    }

    public void enviarCorreo(String asunto, String destinatario, String cuerpo) {
        Correo correo = new Correo(asunto, destinatario, cuerpo);
        servidor.enviar(correo);
    }

    public void borrarCorreo(Correo correo) {
        inbox.remove(correo);
        borrados.add(correo);      
    }

    public void eliminarBorrado(Correo correo) {
        borrados.remove(correo);
    }

    public int contarInbox() {
        return inbox.size();
    }

    public int contarBorrados() {
        return borrados.size();
    }

    // Getters para test o acceso externo
    public List<Correo> getInbox() {
        return inbox;
    }

    public List<Correo> getBorrados() {
        return borrados;
    }
}

/* CLASE CLIENTE BASE DEL ARCHIVO
public class ClienteEMail {
	
	 ServidorPop servidor;
	 String nombreUsuario;
	 String passusuario;
	 ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

} //  Violación del Principio de Abierto/Cerrado (OCP)
  //ClienteEMail depende de ServidorPop directamente, en lugar de depender de la interfaz IServidor. Esto impide cambiar el tipo de servidor sin modificar ClienteEMail.
  //  Violación del Principio de Responsabilidad Única (SRP)
  //ClienteEMail hace demasiadas cosas: conectar, enviar, recibir, manejar inbox y borrados. Ademas de algo de logica del correo
*/