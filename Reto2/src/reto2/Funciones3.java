package reto2;

import java.util.Scanner;

public class Funciones3 {
	public static double menuMoneda(double m) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Qué quieres convertir?");
		System.out.println("1. Euros -> Dólares");
		System.out.println("2. Dólares -> Euros");
		System.out.println("-> ");
		
		int opcion;
		do {
			opcion = Integer.parseInt(sc.nextLine());
			if (opcion != 1 && opcion != 2) System.out.print("-> ");
		} while (opcion != 1 && opcion != 2);
		if (opcion == 1) return euroAdolar(m);
		else return dolarAeuro(m);
	}
	public static double euroAdolar (double euro) {
		return euro * 1.10;
	}
	public static double dolarAeuro (double dolar) {
		return dolar * 0.91;
	}
	
	
	public static double menuMAngulo(double a) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Qué quieres convertir?");
		System.out.println("1. Grados -> Radianes");
		System.out.println("2. Radianes -> Grados");
		System.out.println("-> ");
		
		int opcion;
		do {
			opcion = Integer.parseInt(sc.nextLine());
			if (opcion != 1 && opcion != 2) System.out.print("-> ");
		} while (opcion != 1 && opcion != 2);
		if (opcion == 1) return euroAdolar(a);
		else return dolarAeuro(a);
	}
	public static double gradosAradianes (double grados) {
		return grados * (Math.PI / 180);
	}
	public static double radianesAgrados (double radianes) {
		return radianes * (180 /Math.PI);
	}
}
