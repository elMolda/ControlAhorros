package co.appAhorro.Modelo;


/**
 * @author David Molano
 *Clase que modela las monedas.
 *El atributo denominacion solo puede tomar los valores determinados en peso colombiano.
 *El atributo numMonedas indica la cantidad de monedas de una dicha denominacion.
 *
 */
public class Moneda implements IDinero{
	
	private int numMonedas;
	private double denominacion;
	
	public void setNumMonedas(int numMonedas) {
		
		this.numMonedas = numMonedas;
		
	}
	
	public int getNumMonedas() {
		
		return this.numMonedas;
		
	}
	
	public double getDenominacion() {
		
		return this.denominacion;
		
	}
	
	public void setDenominacion(double denominacion) throws DenominacionNoValidaException {
		
		if(!(denominacion==1000) || !(denominacion==500) || !(denominacion==200) || !(denominacion==100) || !(denominacion==50) ) {
			
			throw new DenominacionNoValidaException("Denominacion de Moneda no Valida");
			
		} else {
			
			this.denominacion = denominacion;
			
		}
		
	}

	@Override
	public double calcularValorDinero() {
		
		return this.denominacion * this.numMonedas;
		
	}
}
