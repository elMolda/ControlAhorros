package co.appAhorro.Controlador;

import java.util.Scanner;

import co.appAhorro.Modelo.Negocio.DenominacionNoValidaException;
import co.appAhorro.Modelo.Negocio.SistemaAhorro;

public class TestSistemaAhorro {
	
	public static void main(String[] args) throws DenominacionNoValidaException {
		
		System.out.println("Ingrese la cantidad de monedas segun el valor solicitado");
		Scanner sc = new Scanner(System.in);
		String aux;
		int cantidades[] = new int[11];
		
		for(int i=0;i<cantidades.length;i++) {
			
			switch(i) {
			
				case 0:
					System.out.println("Cantidad de billetes de 50k");
					aux = sc.next();
					cantidades[i] = Integer.parseInt(aux);
					break;
				case 1:
					System.out.println("Cantidad de billetes de 20k");
					aux = sc.next();
					cantidades[i] = Integer.parseInt(aux);
					break;
				case 2:
					System.out.println("Cantidad de billetes de 10k");
					aux = sc.next();
					cantidades[i] = Integer.parseInt(aux);
					break;
				case 3:
					System.out.println("Cantidad de billetes de 5k");
					aux = sc.next();
					cantidades[i] = Integer.parseInt(aux);
					break;
				case 4:
					System.out.println("Cantidad de billetes de 2k");
					aux = sc.next();
					cantidades[i] = Integer.parseInt(aux);
					break;
				case 5:
					System.out.println("Cantidad de billetes de 1k");
					aux = sc.next();
					cantidades[i] = Integer.parseInt(aux);
					break;
				case 6:
					System.out.println("Cantidad de mondeas de 1k");
					aux = sc.next();
					cantidades[i] = Integer.parseInt(aux);
					break;
				case 7:
					System.out.println("Cantidad de mondeas de 500");
					aux = sc.next();
					cantidades[i] = Integer.parseInt(aux);
					break;
				case 8:
					System.out.println("Cantidad de mondeas de 200");
					aux = sc.next();
					cantidades[i] = Integer.parseInt(aux);
					break;
				case 9:
					System.out.println("Cantidad de mondeas de 100");
					aux = sc.next();
					cantidades[i] = Integer.parseInt(aux);
					break;
				case 10:
					System.out.println("Cantidad de mondeas de 50");
					aux = sc.next();
					cantidades[i] = Integer.parseInt(aux);
					break;
				default:
					System.out.println("Opcion no valida, digite una opcion valida");
				
			}
			
		}
		
		SistemaAhorro sis = new SistemaAhorro();	
		System.out.println(sis.ingresarAhorro(cantidades));
		
		
	}

}
