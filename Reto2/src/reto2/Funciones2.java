package reto2;

import java.util.Scanner;

public class Funciones2 {  
	
	public static void menuTemperatura () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Qué quieres convertir?");
		System.out.println("1. Celsius -> Fahrenheit");
		System.out.println("2. Fahrenheit -> Celsius");
		System.out.print("-> ");
		int opcion;
		do {
			opcion = Integer.parseInt(sc.nextLine());
			if (opcion != 1 && opcion != 2 && opcion != 0) System.out.print("-> ");
		} while (opcion != 1 && opcion != 2 && opcion != 0);
		if (opcion == 1) {
			System.out.print("Introduce las millas: ");
			double celsius = Double.parseDouble(sc.nextLine());
			System.out.println(celsius + " celsius -> " + Celsius_Fah(celsius) + " fahrenheit");
		} else if (opcion == 2) {
			System.out.print("Introduce los kilómetros: ");
			double fahrenheit = Double.parseDouble(sc.nextLine());
			System.out.println(fahrenheit + " fahrenheit -> " + Fah_Celsius(fahrenheit) + " celsius");
		}
		sc.close();
		return;
	}	
	
	public static void menuVolumen (double v) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Qué quieres convertir?");
		System.out.println("1. Litros -> Galones");
		System.out.println("2. Galones -> Litros");
		System.out.print("-> ");
		int opcion;
		do {
			opcion = Integer.parseInt(sc.nextLine());
			if (opcion != 1 && opcion != 2 && opcion != 0) System.out.print("-> ");
		} while (opcion != 1 && opcion != 2 && opcion != 0);
		if (opcion == 1) {
			System.out.print("Introduce las millas: ");
			double litros = Double.parseDouble(sc.nextLine());
			System.out.println(litros + " litros -> " + Litros_Gal(litros) + " galones");
		} else if (opcion == 2) {
			System.out.print("Introduce los kilómetros: ");
			double galones = Double.parseDouble(sc.nextLine());
			System.out.println(galones + " galones -> " + Gal_Litros(galones) + " litros");
		}
		sc.close();
		return;
	} 
	
	
	private static double Celsius_Fah(double temp) {
		return (temp * (9/5)) + 32;
	}
	private static double Fah_Celsius(double temp) {
		return (temp - 32) * (5.0/9.0);  
	}


	private static double Litros_Gal(double Vol) {
		return Vol * 0.264172;    
	}
	private static double Gal_Litros(double Vol) {
		return Vol * 3.785411784;      
	}

}
