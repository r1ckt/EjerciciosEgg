/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
*/
package ejercicio22;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioVeintidos {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingresar la dimension del vector: ");
        int[] vect = new int[scan.nextInt()];
        
        llenarVector(vect);
        mostrarVector(vect);
        chequearVector(vect);
        
        
        
    }
    public static void llenarVector(int[] v){
        for(int i = 0; i < v.length; i++){
            v[i] = (int) Math.floor(Math.random() * 99999);
        }
    }
    
    public static void mostrarVector(int[] v){
        for(int i = 0; i < v.length; i++){
            if(i == v.length - 1){
                System.out.println(v[i] + ".");
            } else {
                System.out.print(v[i] + ", ");
            }
        }
    }
    
    public static void chequearVector(int[] v){
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        
        for(int i = 0; i < v.length; i++){
            if(v[i] >= 0 && v[i] <= 9){
                cont1++;
            } else if(v[i] >= 10 && v[i] <= 99){
                cont2++;
            } else if(v[i] >= 100 && v[i] <= 999){
                cont3++;
            } else if(v[i] >= 1000 && v[i] <= 9999){
                cont4++;
            } else if(v[i] >= 10000 && v[i] <= 99999){
                cont5++;
            }
        }
        System.out.println("Números de 1 dígito: " + cont1);
        System.out.println("Números de 2 dígitos: " + cont2);
        System.out.println("Números de 3 dígitos: " + cont3);
        System.out.println("Números de 4 dígitos: " + cont4);
        System.out.println("Números de 5 dígitos: " + cont5);
    }
}
