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
	private DenominacionBillete denominacion;
	
	public Billete() {
		
	}
	
	public void setNumBilletes(int numMonedas) {
		
		this.numBilletes = numMonedas;
		
	}
	
	public int getNumMonedas() {
		
		return this.numBilletes;
		
	}
	
	public DenominacionBillete getDenominacion() {
		
		return this.denominacion;
		
	}
	
	@Override
	public double getDenominacionDouble() {
		
		if (denominacion.equals(DenominacionBillete.CINCUENTAMIL)) {
			return 50000;
		} else if (denominacion.equals(DenominacionBillete.VEINTEMIL)) {
					return 20000;
				} else if (denominacion.equals(DenominacionBillete.DIEZMIL)) {
							return 10000;
						} else if (denominacion.equals(DenominacionBillete.CINCOMIL)) {
									return 5000;
								} else if (denominacion.equals(DenominacionBillete.DOSMIL)) {
											return 2000;
										} else if (denominacion.equals(DenominacionBillete.MIL)) {
													return 1000;
												}
		return 0;
	}
	
	@Override
	public void setDenominacion(double denominacion) throws DenominacionNoValidaException {
		
		if (!(denominacion==50000) || !(denominacion==20000) || !(denominacion==10000) || !(denominacion==5000) || !(denominacion==2000) || !(denominacion==1000) ) {
			throw new DenominacionNoValidaException("Denominacion de Billete no Valida");
		} else if (denominacion == 50000) {
					this.denominacion = DenominacionBillete.CINCUENTAMIL;
				} else if (denominacion == 20000) {
							this.denominacion = DenominacionBillete.VEINTEMIL;
						} else if (denominacion == 10000) {
									this.denominacion = DenominacionBillete.DIEZMIL;
								} else if (denominacion == 5000) {
											this.denominacion = DenominacionBillete.CINCOMIL;
										} else if (denominacion == 2000) {
													this.denominacion = DenominacionBillete.DOSMIL;
												} else if (denominacion == 1000) {
															this.denominacion = DenominacionBillete.MIL;
														}
		
	}
	
	public void setDenominacion(DenominacionBillete denominacion) {
		
		this.denominacion = denominacion;
		
	}

	
	@Override
	public double calcularValorDinero() {
		
		return this.getDenominacionDouble() * this.numBilletes;
	}

}
