/*
Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
*/
package ejercicio6;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioSeis {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese dos numeros: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        if(num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
        } else {
            System.out.println(num2 + " es mayor que " + num1);
        }
    }
}
