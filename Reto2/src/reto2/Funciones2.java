package reto2;

public class Funciones2 {  
public static double Temp_Celsius_Fah(double temp) {
	return (temp * (9/5)) + 32;
}
public static double Temp_Fah_Celsius(double temp) {
	return (temp - 32) * (5.0/9.0);  
}
public static double Vol_Litros_Gal(double Vol) {
	return Vol * 0.264172;    
}
public static double Vol_Gal_Litros(double Vol) {
	return Vol * 3.785411784;      
}

}
