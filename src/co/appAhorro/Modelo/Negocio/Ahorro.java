package co.appAhorro.Modelo.Negocio;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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
	
	public String existo(){
		return "EXISTO";
	}
	
	public double ingresarAhorro(int cont50k, int cant20k, int cant10k,
								int cant5k, int cant2k, int cant1k,
								int cantMon1k, int cant500, int cant200,
								int cant100, int cant50) throws DenominacionNoValidaException {
		
		
		IDinero b50k = new Billete(cont50k,50000);
		monedasBilletes.put(b50k.getDenominacionDouble(), b50k);
		IDinero b20k = new Billete(cant20k,20000);
		monedasBilletes.put(b20k.getDenominacionDouble(), b20k);
		IDinero	b10k = new Billete(cant10k,10000);
		monedasBilletes.put(b10k.getDenominacionDouble(), b10k);
		IDinero b5k = new Billete(cant5k,5000);
		monedasBilletes.put(b5k.getDenominacionDouble(), b5k);
		IDinero b2k = new Billete(cant2k,2000);
		monedasBilletes.put(b2k.getDenominacionDouble(), b2k);
		IDinero b1k = new Billete(cant1k,1000);
		monedasBilletes.put(b1k.getDenominacionDouble(), b1k);
		IDinero m1k = new Moneda(cantMon1k,1000);
		monedasBilletes.put(m1k.getDenominacionDouble(), m1k);
		IDinero m500 = new Moneda(cant500,500);
		monedasBilletes.put(m500.getDenominacionDouble(), m500);
		IDinero m200 = new Moneda(cant200,200);
		monedasBilletes.put(m200.getDenominacionDouble(), m200);
		IDinero m100 = new Moneda(cant100,100);
		monedasBilletes.put(m100.getDenominacionDouble(), m100);
		IDinero m50 = new Moneda(cant50,50);
		monedasBilletes.put(m50.getDenominacionDouble(), m50);
		
		totalAhorrado = this.calcularValorAhorro();
		
		return this.totalAhorrado;
			
	}
	
	private double calcularValorAhorro() {
		
		double ahorro = 0;
		for(Entry<Double,IDinero> d: this.monedasBilletes.entrySet()) {
			ahorro+=d.getValue().calcularValorDinero();
		}
		return ahorro;
	}
	
	
}
