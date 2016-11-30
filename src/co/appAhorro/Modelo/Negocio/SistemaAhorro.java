package co.appAhorro.Modelo.Negocio;

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
	
	
	
	public double ingresarAhorro(int cont50k, int cant20k, int cant10k, int cant5k, int cant2k, int cant1k, int cantMon1k, int cant500, int cant200, int cant100, int cant50) throws DenominacionNoValidaException {
		
		Ahorro ahorroNuevo = new Ahorro();
		this.ahorros.add(ahorroNuevo);
		return this.ahorros.get(this.ahorros.indexOf(ahorroNuevo)).ingresarAhorro(cont50k, cant20k,cant10k,cant5k,cant2k,cant1k,cantMon1k,cant500,cant200,cant100,cant50);

	}
	
	
	
	
	
	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	
	
	
	

}
