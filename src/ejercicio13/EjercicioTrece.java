/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
*/
package ejercicio13;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioTrece {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese un valor límite (el número debe ser positivo): ");

        int valorLimite = scan.nextInt();
        int suma = 0;
        if (valorLimite > 0) {
            System.out.println("Ahora, ingrese valores, cuando la suma de éstos supere el valor limite terminará la ejecucion del programa");

            while (true) {
                int valores = scan.nextInt();
                suma += valores;

                if (suma > valorLimite) {
                    System.out.println("La suma de los valores ingresados supera el limite.");
                    System.out.println("Suma: " + suma);
                    System.out.println("Valor límite: " + valorLimite);
                    break;
                }
            }
        }
    }
}
