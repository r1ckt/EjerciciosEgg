/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse.
*/

package ejercicio15;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioQuince {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int sum = 0;

        System.out.println("Ingrese 20 números como maximo");
        for (int i = 0; i <= 20; i++) {
            int num = scan.nextInt();

            if (num == 0) {
                System.out.println("Se capturó el número cero");
                break;
            } else if (num > 0) {
                sum += num;
            }
        }
        System.out.println("La suma de los números ingresados es: " + sum);
    }
}
