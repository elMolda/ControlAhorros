package co.appAhorro.Modelo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * @author David Molano
 *Clase que modela el ahorro.
 *El atributo fechaAhorro indica la fecha del ahorro.
 *El atributo de totalAhorrado indica la suma de todos las monedas y billetes que el usuario indico.
 *Tiene un Map de IDinero, donde las llaves son las denominaciones para evitar que se repitan.
 * 
 */
public class Ahorro {

	private LocalDate fechaAhorro;
	private double totalAhorrado;
	private Map<Double, IDinero> monedasBilletes;
	
	public Ahorro() {
		
		this.fechaAhorro = LocalDate.now();
		this.monedasBilletes = new HashMap<Double, IDinero>();
		
	}
	
	
	
	
}
