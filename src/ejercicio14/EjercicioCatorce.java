/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
*/
package ejercicio14;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioCatorce {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese dos numeros enteros positivos: ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        double division = 1.0;

        String opcion2 = "";

        if (num1 > 0 && num2 > 0) {
            while (true) {
                System.out.println("MENU");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println("Elija opcion: ");
                int opcion = scan.nextInt();

                switch (opcion) {
                    case 1:
                        suma = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + suma);
                        break;
                    case 2:
                        resta = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + resta);
                        break;
                    case 3:
                        multiplicacion = num1 * num2;
                        System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
                        break;
                    case 4:
                        division = 1.0 * num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + division);
                        break;
                    case 5:
                        System.out.println("¿Está seguro que desea salir del programa?");
                        opcion2 = scan.next().toUpperCase();

                        if (opcion2.equals("N")) {
                            continue;
                        }
                }
                if (opcion2.equals("S")) {
                    break;
                }

            }
        }
    }

}
