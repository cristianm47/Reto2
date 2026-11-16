package reto2;

import java.util.Scanner;

public class reto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int operacion;
		do {
			System.out.println("Selecciona el tipo de conversión:");
			System.out.println("1. Longitud");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			System.out.println("5. Moneda");
			System.out.println("6. Ángulo");
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
					Funciones2.menuTemperatura();
					break;
				case 4:
					Funciones2.menuVolumen();
					break;
				case 5:
					Funciones2.menuMoneda();
					break;
				case 6:
					Funciones2.menuAngulo();
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
