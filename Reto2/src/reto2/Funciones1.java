package reto2;

import java.util.Scanner;

public class Funciones1 {
	
	public static void menuLongitud() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecciona la conversión de longitud:");
		System.out.println("1. Millas a kilómetros");
		System.out.println("2. Kilómetros a millas");
		System.out.println("0. Salir");
		System.out.print("-> ");
		int opcion;
		do {
			opcion = Integer.parseInt(sc.nextLine());
			if (opcion != 1 && opcion != 2 && opcion != 0) System.out.print("-> ");
		} while (opcion != 1 && opcion != 2 && opcion != 0);
		if (opcion == 1) {
			System.out.print("Introduce las millas: ");
			double millas = Double.parseDouble(sc.nextLine());
			System.out.println(millas + " millas -> " + millasAKm(millas) + " Km");
		} else if (opcion == 2) {
			System.out.print("Introduce los kilómetros: ");
			double km = Double.parseDouble(sc.nextLine());
			System.out.println(km + " Km -> " + kmAMillas(km) + " millas");
		}
		
		sc.close();
		return;
	}
	
	public static void menuPeso(double p) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecciona la conversión de peso:");
		System.out.println("1. Kilogramos a libras");
		System.out.println("2. Libras a kilogramos");
		System.out.println("0. Salir");
		System.out.print("-> ");
		int opcion;
		do {
			opcion = Integer.parseInt(sc.nextLine());
			if (opcion != 1 && opcion != 2) System.out.print("-> ");
		} while (opcion != 1 && opcion != 2);
		if (opcion == 1) {
			
		} else {
			
		}
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
