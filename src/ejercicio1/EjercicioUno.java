/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
*/

package ejercicio1;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese dos numeros enteros: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma de los numeros ingresados es: " + suma);


    }
    
}
