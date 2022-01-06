/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz.
*/
package ejercicio23;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioVeintitres {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int[][] m = new int[scan.nextInt()][scan.nextInt()];
        int[][] mT = new int[m[0].length][m.length]; // transpuesta de m

        System.out.println(m.length);

        llenarMatriz(m);
        System.out.println("Matriz:");
        mostrarMatriz(m);
        
        System.out.println("");
        llenarTranspuesta(m, mT);
        System.out.println("Transpuesta: ");
        mostrarMatriz(mT);


    }

    public static void llenarMatriz(int[][] m) {
        for(int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) Math.floor(Math.random() * 20);
            }
        }
    }

    public static void mostrarMatriz(int[][] m) {
        for(int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("[" + m[i][j] + "] ");
            }
            System.out.println("");
        }
    }

    public static void llenarTranspuesta(int[][] m, int[][] mT) {
        for(int i=0; i < m.length; i++){
            for(int j=0; j < m[i].length; j++){
                mT[j][i] = m[i][j];
            }
        }

    }

}
