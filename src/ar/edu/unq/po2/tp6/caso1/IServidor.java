package ar.edu.unq.po2.tp6.caso1;

import java.util.List;

public interface IServidor {
	
	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passusuario);

	public void enviar(Correo correo);
	//no son necesarios porque no los usa nadie
	//public float tazaDeTransferencia();

	//public void resetear();
	
	//public void realizarBackUp();

} //violación del principio de Interfaz Segura (ISP).
  //IServidor esta "gorda"
  //Contiene métodos como resetear(), realizarBackUp(), y tazaDeTransferencia() que no son usados por ClienteEMail, ni por ServidorPop.
