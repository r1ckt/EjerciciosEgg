/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
*/
package ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioOcho {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        String frase = scan.next();
        
        if(frase.equals("eureka")){
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }
    }
}
