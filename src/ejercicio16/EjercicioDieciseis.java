/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas.
*/
package ejercicio16;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioDieciseis {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese secuencias FDE: ");

        int contC = 0;
        int contI = 0;
        
        while (true) {
            String sec = scan.next().toUpperCase();

            if (sec.equals("&&&&&")) {
                break;
            }
            if (sec.substring(0, 1).equals("X") && sec.substring(4).equals("O") && sec.length() == 5) {
                contC++;
            } else {
                contI++;
            }

        }

        System.out.println("Cantidad de lecturas correctas: " + contC);
        System.out.println("Cantidad de lecturas incorrectas: " + contI);

    }

}
