package ar.edu.unq.po2.tp6.caso1;

import java.util.ArrayList;
import java.util.List;

public class ServidorPop implements IServidor {
	//private boolean conexionActiva = false;
    //private List<Correo> correosEnviados = new ArrayList<>();
    //private List<Correo> nuevosCorreos = new ArrayList<>(); 
	//faltan modificaciones por si quiero probar

	public List<Correo> recibirNuevos(String user, String pass) {
		List<Correo> retorno = new ArrayList<Correo>();
	  //Verificar autenticidad de usuario.
		//obtener emails Nuevos del usuario.
		//asignar a retorno la lista de los nuevos e-mails.
		return retorno;
	}

	public void conectar(String nombreUsuario, String passusuario) {
	   //Verifica que el usuario sea valido y establece la conexion. this.conexionActiva = true;
		
	}

	public void enviar(Correo correo) {
      //realiza lo necesario para enviar el correo.	 correosEnviados.add(correo);	
	}

	/*	metodos ya no necesarios
	 * @Override
	public float tazaDeTransferencia() {
		//no corresponde
		return 0;
	}

	@Override
	public void resetear() {
         //no corresponde		
	}

	@Override
	public void realizarBackUp() {
		//no corresponde
		
	}
*/ 


}