/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”.
*/
package ejercicio10;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioDiez {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una frase: ");
        String frase = scan.next();
        char primerChar = frase.charAt(0);
        
        if(primerChar == 'A'){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
