package co.appAhorro.Modelo.Negocio;

import java.util.ArrayList;
import java.util.List;

import co.appAhorro.Controlador.Controlador;

/**
 * @author David Molano
 *Clase de acceso al sistema, conocida como de Logica o Negocio.
 *Aqui se difinen las diferentes funcionalidades que ofrece el sistema.
 *
 */

public class SistemaAhorro {
	
	private Controlador controlador;
	private List<Ahorro> ahorros;
	
	public SistemaAhorro() {
		this.ahorros = new ArrayList<Ahorro>();
	}
	
	
	public double ingresarAhorro(int cantidades[]) throws DenominacionNoValidaException {
		
		Ahorro ahorroNuevo = new Ahorro();
		ahorros.add(ahorroNuevo);
		return ahorros.get(ahorros.indexOf(ahorroNuevo)).ingresarAhorro(cantidades[0], cantidades[1],cantidades[2],
																				cantidades[3],cantidades[4],cantidades[5],
																				cantidades[6],cantidades[7],cantidades[8],cantidades[8],cantidades[10]);

	}
	
	
	
	
	
	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	
	
	
	

}
