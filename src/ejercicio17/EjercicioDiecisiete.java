/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

* * * *
*     *
*     *
* * * *

*/
package ejercicio17;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioDiecisiete {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int num = scan.nextInt();
        
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                
                if(i == 0 || i == num - 1 || j == num - 1 || j == 0){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
