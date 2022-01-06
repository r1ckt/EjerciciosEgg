/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
*/
package ejercicio21;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioVeintiuno {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el tamaño del vector: ");
        int[] vector = new int[scan.nextInt()];

        llenarVector(vector);
        imprimirVector(vector);

        System.out.println("Ingrese el valor que desea encontrar: ");
        int vNum = scan.nextInt();

        buscarEnVector(vector, vNum);

    }

    public static void llenarVector(int[] v) {
        
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) Math.floor(Math.random() * 10);
        }
        
    }

    public static void buscarEnVector(int[] v, int vNum) {
        int cont = 0;
        int auxi = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == vNum) {
                cont++;
                auxi = i;
            }
        }
        
        if (cont == 0) {
            System.out.println(vNum + " no se encuentra en el vector");
        } else {
            System.out.println(vNum + " Se encuentra en la posicion " + auxi);
            System.out.println(vNum + " Se encuentra repetido " + cont + " veces");
        }
        
    }

    public static void imprimirVector(int[] v) {
        
        for (int i = 0; i < v.length; i++) {
            
            if (i == v.length - 1) {
                System.out.print(v[i] + ". ");
            } else {
                System.out.print(v[i] + ", ");
            }
            
        }
        
        System.out.println("");
        
    }

}
