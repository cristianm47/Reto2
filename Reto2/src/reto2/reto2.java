package reto2;

import java.util.Scanner;

public class reto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int operacion, valor;
		do {
			System.out.println("Selecciona el tipo de conversión:");
			System.out.println("1. Longitud");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			System.out.println("0. Salir");
			System.out.println("-> ");
			operacion = Integer.parseInt(sc.nextLine());
			switch (operacion) {
				case 1:
					Funciones1.menuLongitud();
					break;
				case 2:
					Funciones1.menuPeso();
					break;
				case 3:
					//Temperatura
					break;
				case 4:
					//Volumen
					break;
				case 0:
					System.out.println("Fin del programa.");
					break;
				default:
					System.out.println("Opción incorrecta.\n");
					break;
			}
		} while (operacion != 0);
	}

}
