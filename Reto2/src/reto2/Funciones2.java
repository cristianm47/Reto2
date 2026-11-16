package reto2;

public class Funciones2 { 
public static double Temp_Celsius_Fah(double temp) {
	return (temp * (9/5)) + 32;
}
public static double Temp_Fah_Celsius(double temp) {
	return (temp - 32) * (5.0/9.0);  
}
}
