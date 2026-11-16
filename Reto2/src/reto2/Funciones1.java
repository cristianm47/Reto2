package reto2;

import java.util.Scanner;

public class Funciones1 {
	
	public static double menuLongitud(double l) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Qué quieres convertir?");
		System.out.println("1. Millas -> Kilómetros");
		System.out.println("2. Kilómetros -> Millas");
		System.out.print("-> ");
		int opcion;
		do {
			opcion = Integer.parseInt(sc.nextLine());
			if (opcion != 1 && opcion != 2) System.out.print("-> ");
		} while (opcion != 1 && opcion != 2);
		if (opcion == 1) return millasAKm(l);
		else return kmAMillas(l);
	}
	
	public static double menuPeso(double p) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Qué quieres convertir?");
		System.out.println("1. Kilogramos -> Libras");
		System.out.println("2. Libras -> Kilogramos");
		System.out.print("-> ");
		int opcion;
		do {
			opcion = Integer.parseInt(sc.nextLine());
			if (opcion != 1 && opcion != 2) System.out.print("-> ");
		} while (opcion != 1 && opcion != 2);
		if (opcion == 1) return kgALibras(p);
		else return librasAKg(p);
	}
	
	private static double millasAKm(double millas) {
		return millas*1.60934;
	}
	
	private static double kmAMillas(double km) {
		return km/1.60934;
	}
	
	private static double kgALibras(double kg) {
		return kg*2.20462;
	}
	
	private static double librasAKg(double libras) {
		return libras/2.20462;
	}
}
