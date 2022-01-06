/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
*/
package ejercicio26;

public class EjercicioVeintiseis {

    public static void main(String[] args) {
        int[][] m = new int[10][10];
        int[][] n = new int[3][3];

        // matriz 10x10
        llenarMatriz(m);
        imprimirMatriz(m);

        // matriz 3x3
        llenarMatriz(n);
        imprimirMatriz(n);

        // chequeos
        chequearMatriz(m, n);
    }

    public static void llenarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = j + i;
            }
        }
    }

    public static void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("[" + m[i][j] + "] ");
            }
            System.out.println("");
        }
    }

    public static void chequearMatriz(int[][] m, int[][] n) {
        String s = "";

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (n[0][0] == m[i][j]) {
                    int auxi = i;
                    int auxj = j;

                    int cont = 0; 

                    for (int k = 0; k < 3; k++) {
                        for (int q = 0; q < 3; q++) {
                            if (auxi < 10 && auxj < 10) {

                                if (n[k][q] == m[auxi][auxj]) {
                                    cont++;
                                    s = s + "[" + auxi + "," + auxj + "]" + " - ";
                                }
                            }
                            auxj++;
                        }
                        auxj = j;
                        auxi++;
                    }

                    if (cont == 9) {
                        System.out.println("Correcto porque coinciden " + cont + " elementos");
                        System.out.println(s);

                    } else {
                        System.out.println("Incorrecto porque solo coinciden " + cont + " elementos");

                    }

                }

            }

        }
    }
}
