/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas.
*/
package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una frase: ");
        String frase = scan.next();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
    }
}