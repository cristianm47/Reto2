package reto2;

import java.util.Scanner;

public class Funciones3 {
	public static void menuMoneda() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Qué quieres convertir?");
		System.out.println("1. Euros -> Dólares");
		System.out.println("2. Dólares -> Euros");
		System.out.println("-> ");
		
		int opcion;
		do {
			opcion = Integer.parseInt(sc.nextLine());
			if (opcion != 1 && opcion != 2 && opcion != 0) System.out.print("-> ");
		} while (opcion != 1 && opcion != 2 && opcion != 0);
		if (opcion == 1) {
			System.out.print("Introduce los euros: ");
			double euro = Double.parseDouble(sc.nextLine());
			System.out.println(euro + " € -> " + euroAdolar(euro) + " $");
		} else if (opcion == 2) {
			System.out.print("Introduce los dólares: ");
			double dolar = Double.parseDouble(sc.nextLine());
			System.out.println(dolar + " $ -> " + dolarAeuro(euro) + " €");
		}
		
		sc.close();
		return;
	}
		
		
	public static void menuMAngulo () {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("¿Qué quieres convertir?");
		System.out.println("1. Grados -> Radianes");
		System.out.println("2. Radianes -> Grados");
		System.out.println("-> ");
			
		int opcion;
		do {
			opcion = Integer.parseInt(sc.nextLine());
			if (opcion != 1 && opcion != 2 && opcion != 0) System.out.print("-> ");
		} while (opcion != 1 && opcion != 2 && opcion != 0);
		if (opcion == 1) {
			System.out.print("Introduce las millas: ");
			double grados = Double.parseDouble(sc.nextLine());
			System.out.println(grados + " grados -> " + gradosAradianes(grados) + " radianes");
		} else if (opcion == 2) {
			System.out.print("Introduce los radianes: ");
			double radianes = Double.parseDouble(sc.nextLine());
			System.out.println(radianes + " radianes -> " + radianesAgrados(radianes) + " grados");
		}
		
		sc.close();
		return;
	}
	
	private static double euroAdolar (double euro) {
		return euro * 1.10;
	}
	private static double dolarAeuro (double dolar) {
		return dolar * 0.91;
	}
	
	private static double gradosAradianes (double grados) {
		return grados * (Math.PI / 180);
	}
	private static double radianesAgrados (double radianes) {
		return radianes * (180 /Math.PI);
	}
}
