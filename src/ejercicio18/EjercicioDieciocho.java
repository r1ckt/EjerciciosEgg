/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:

5 *****
3 ***
11 ***********
2 **

*/
package ejercicio18;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioDieciocho {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        int num = scan.nextInt();
        
        System.out.print(num + " ");
        
        for(int i = 0; i < num; i++){
            if(num >= 0 && num <= 20){
                System.out.print("*");
            }
        }
        System.out.println("");
    }
    
}
