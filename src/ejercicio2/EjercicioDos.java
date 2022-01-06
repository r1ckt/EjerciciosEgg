/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla
*/

package ejercicio2;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingresá tu nombre: ");
        String nombre = scan.next();
        
        System.out.println(nombre);


    }
    
}
