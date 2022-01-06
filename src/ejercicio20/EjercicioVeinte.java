/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
*/
package ejercicio20;


public class EjercicioVeinte {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] vector = new int[100];
        
        llenarVector(vector);
        imprimirVector(vector);
        
    }
    
    public static void llenarVector(int[] vector){
        for(int i = 0; i<vector.length; i++){
            vector[i] += i;
        }
    }
    
    public static void imprimirVector(int[] vector){
        for(int i = 100; i >= 0; i--){
            System.out.print(vector[i] + " ,");
        }
    }
    
}
