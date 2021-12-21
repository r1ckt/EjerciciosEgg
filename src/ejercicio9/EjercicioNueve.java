
package ejercicio9;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioNueve {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una frase que contenga 8 caracteres como máximo: ");
        String frase = scan.next();
        
        if(frase.length() == 8){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
