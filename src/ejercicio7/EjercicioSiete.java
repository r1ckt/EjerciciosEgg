package ejercicio7;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioSiete {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingresar numero: ");
        int num = scan.nextInt();
        
        if(num % 2 == 0){
            System.out.println(num + " es par.");
        } else {
            System.out.println(num + " es impar.");
        }
    }
    
}
