package reto2;

import java.util.Scanner;

public class Funciones2 {  
	
	public static double Temp_Celsius_Fah (double t) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Qué quieres convertir?");
		System.out.println("1. Celsius -> Fahrenheit");
		System.out.println("2. Fahrenheit -> Celsius");
		System.out.print("-> ");
		int opcion;
		do {
			opcion = Integer.parseInt(sc.nextLine());
			if (opcion != 1 && opcion != 2) System.out.print("-> ");
		} while (opcion != 1 && opcion != 2);
		if (opcion == 1) return Celsius_Fah(t);
		else return Fah_Celsius(t);
	}	
	
	public static double Vol_Litros_Gal (double v) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Qué quieres convertir?");
		System.out.println("1. Litros -> Galones");
		System.out.println("2. Galones -> Litros");
		System.out.print("-> ");
		int opcion;
		do {
			opcion = Integer.parseInt(sc.nextLine());
			if (opcion != 1 && opcion != 2) System.out.print("-> ");
		} while (opcion != 1 && opcion != 2);
		if (opcion == 1) return Litros_Gal(v);
		else return Gal_Litros(v);
	}
	
public static double Celsius_Fah(double temp) {
	return (temp * (9/5)) + 32;
}
public static double Fah_Celsius(double temp) {
	return (temp - 32) * (5.0/9.0);  
}


public static double Litros_Gal(double Vol) {
	return Vol * 0.264172;    
}
public static double Gal_Litros(double Vol) {
	return Vol * 3.785411784;      
}

}
