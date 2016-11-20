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
	private DenominacionMoneda denominacion;
	
	public void setNumMonedas(int numMonedas) {
		
		this.numMonedas = numMonedas;
		
	}
	
	public int getNumMonedas() {
		
		return this.numMonedas;
		
	}
	
	public DenominacionMoneda getDenominacion() {
		
		return this.denominacion;
		
	}
	
	@Override
	public double getDenominacionDouble() {
		
		if (denominacion.equals(DenominacionMoneda.MIL)) {
			return 1000;
		} else if(denominacion.equals(DenominacionMoneda.QUINIENTOS)) {
					return 500;
				} else if(denominacion.equals(DenominacionMoneda.DOSCIENTOS)) {
							return 200;
						} else if (denominacion.equals(DenominacionMoneda.CIEN)) {
									return 100;
								} else if (denominacion.equals(DenominacionMoneda.CINCUENTA)) {
											return 50;
										}
		return 0;
	}
	
	@Override
	public void setDenominacion(double denominacion) throws DenominacionNoValidaException {
		
		if (!(denominacion==1000) || !(denominacion==500) || !(denominacion==200) || !(denominacion==100) || !(denominacion==50)) {
			throw new DenominacionNoValidaException("Denominacion de Moneda no Valida");	
		} else if (denominacion == 1000) {
					this.denominacion = DenominacionMoneda.MIL;
				} else if(denominacion == 500) {
							this.denominacion = DenominacionMoneda.QUINIENTOS;
						} else if(denominacion == 200) {
									this.denominacion = DenominacionMoneda.DOSCIENTOS;
								} else if (denominacion == 100) {
											this.denominacion = DenominacionMoneda.CIEN;
										} else if (denominacion == 50) {
													this.denominacion = DenominacionMoneda.CINCUENTA;
												}
	}
	
	public void setDenominacion(DenominacionMoneda denominacion) {
		
		this.denominacion = denominacion;
		
	}
	
	@Override
	public double calcularValorDinero() {
		
		return this.getDenominacionDouble() * this.numMonedas;
		
	}
}
