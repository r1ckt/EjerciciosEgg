/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9
*/
package ejercicio25;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioVeinticinco {

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = crearMatriz();

        llenarMatriz(matriz);
        imprimirMatriz(matriz);

        int sF = sumarFilas(matriz);
        int sC = sumarColumnas(matriz);
        int sD = sumarDiagonales(matriz);

        esMagica(sF, sC, sD);

    }

    public static int[][] crearMatriz() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el tamaño de la matriz cuadrada: ");
        int n = scan.nextInt();
        int[][] m = new int[n][n];

        return m;
    }

    public static void llenarMatriz(int[][] m) {

        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Ingresar valores para [" + i + ", " + j + "]");

                m[i][j] = scan.nextInt();
            }

        }
    }

    public static void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("[" + m[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static int sumarFilas(int[][] m) {
        int cont = 0;
        int[] sum = new int[m.length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum[i] += m[i][j];
            }
            
            if (sum[i] == sum[0]) {
                cont++;
            }
            
        }
        
        if (cont == m.length) {
            return sum[0];
        }

        return 1;

    }

    public static int sumarColumnas(int[][] m) {
        int cont = 0;
        int[] sum = new int[m.length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum[i] += m[j][i];
            }
            
            if (sum[i] == sum[0]) {
                cont++;
            }
            
        }
        
        if (cont == m.length) {
            return sum[0];
        }
        
        return 0;
    }

    public static int sumarDiagonales(int[][] m) {
        int[] sum = new int[2];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i + j == m.length - 1) {
                    sum[0] += m[i][j];
                }
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    sum[1] += m[i][j];
                }
            }
        }

        if (sum[0] == sum[1]) {
            return sum[0];
        }

        return 0;
    }

    public static void esMagica(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("La matriz es mágica: ");
            System.out.println("Suma de las filas = " + a);
            System.out.println("Suma de las columnas = " + b);
            System.out.println("Suma de las diagonales = " + c);
        } else {
            System.out.println("La matriz no es magica.");
        }
    }

}


