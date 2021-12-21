package ejercicio5;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioCinco {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese un numero: ");
        
        int num = scan.nextInt();
        
        int doble = num * 2;
        int triple = num * 3;
        double raiz = Math.sqrt(1.0 * num);
        
        System.out.println("El doble del número ingresado es: " + doble );
        System.out.println("El triple del número ingresado es: " + triple );
        System.out.println("La raiz cuadrada del número ingresado es: " + raiz );
    }
    
}
