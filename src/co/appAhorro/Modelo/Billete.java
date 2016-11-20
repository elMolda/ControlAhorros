package co.appAhorro.Modelo;

/**
 * @author David Molano
 *Clase que modela los billetes.
 *El atributo con su denominacion que puede tomar unicamente los valores especificos del peso colombiano
 *El atributo numBilletes indica la cantidad de billetes de una denomonacion que hay.
 *
 */
public class Billete implements IDinero {

	private int numBilletes;
	private double denominacion;
	
	public void setNumBilletes(int numMonedas) {
		
		this.numBilletes = numMonedas;
		
	}
	
	public int getNumMonedas() {
		
		return this.numBilletes;
		
	}
	
	public double getDenominacion() {
		
		return this.denominacion;
		
	}
	
	public void setDenominacion(double denominacion) throws DenominacionNoValidaException {
		
		if(!(denominacion==50000) || !(denominacion==20000) || !(denominacion==10000) || !(denominacion==5000) || !(denominacion==2000) || !(denominacion==1000) ) {
			
			throw new DenominacionNoValidaException("Denominacion de Billete no Valida");
			
		} else {
			
			this.denominacion = denominacion;
			
		}
		
	}

	
	@Override
	public double calcularValorDinero() {
		
		return this.denominacion * this.numBilletes;
	}

}
