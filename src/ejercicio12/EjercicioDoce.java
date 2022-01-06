/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
*/

package ejercicio12;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioDoce {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        
        while(true){
            int nota = scan.nextInt();
            
            if(nota < 0 || nota > 10){
                continue;
            } else if(nota >= 0 || nota <= 10){
                System.out.println("Correcto! La nota ingresada fue: " + nota);
                break;
            }
        }
    }
    
}
