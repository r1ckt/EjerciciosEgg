/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
*/
package ejercicio19;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioDiecinueve {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        while (true) {
            System.out.println("Ingrese la cantidad de dolares a convertir");
            double dolares = scan.nextDouble();

            if (dolares == 0) {
                break;
            }

            System.out.println("Ingrese una opcion");
            System.out.println("1 - Convertir a pesos (DOLAR BLUE)");
            System.out.println("2 - Convertir a pesos (DOLAR BNA) ");
            System.out.println("3 - Convertir a pesos (DOLAR CCL)");
            System.out.println("4 - Convertir a pesos (DOLAR SOLIDARIO) ");
            System.out.println("0 - Salir");

            String moneda = scan.next();

            if (Integer.parseInt(moneda) >= 1 && Integer.parseInt(moneda) <= 4) {
                conversor(dolares, moneda);
            }

        }
    }

    public static void conversor(double dolares, String moneda) {
        double pesos = 0.0;

        switch (moneda) {
            case "1":
                pesos = dolares * 204.00;
                System.out.println("Dólar Blue: " + "$" + pesos);
                break;
            case "2":
                pesos = dolares * 107.25;
                System.out.println("Dólar BNA: " + "$" + pesos);
                break;
            case "3":
                pesos = dolares * 205.08;
                System.out.println("Dólar Contado con Liquidación: " + "$" + pesos);

                break;
            case "4":
                pesos = dolares * 176.96;
                System.out.println("Dólar Solidario: " + "$" + pesos);
                break;

        }

    }

}
