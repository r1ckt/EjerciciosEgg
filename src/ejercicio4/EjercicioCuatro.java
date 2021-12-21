package ejercicio4;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese la cantidad de grados Centígrados: ");
        
        int gradosCelsius = scan.nextInt();
        
        int celsiusToFahrenheit = 32 + (9 * gradosCelsius/5);
        
        System.out.println(gradosCelsius + "°C equivalen a " + celsiusToFahrenheit + "°F");
        
    }
    
}
