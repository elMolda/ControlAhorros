package co.appAhorro.Modelo.Negocio;

/**
 * @author David Molano
 *Interface que modela el dinero en general sin diferenciar si se trata de monedas o billetes
 *
 */
public interface IDinero {
	
	double calcularValorDinero();
	void setDenominacion(double denominacion) throws DenominacionNoValidaException;
	double getDenominacionDouble();
}
