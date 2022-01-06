/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
*/
package ejercicio24;

public class EjercicioVeinticuatro {

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] m = new int[3][3];
        // m = {{1 , 2, 3}, {1 , 2, 3 }, {1 , 2, 3}}
        int[][] mt = new int[m[0].length][m.length];

        llenarMatriz(m);
        imprimirMatriz(m);
        System.out.println("");

        transponerMatriz(m, mt);
        imprimirMatriz(mt);
        System.out.println("");

        verificarSimetria(m, mt);

    }

    public static void llenarMatriz(int[][] m) {
        /*
        m[0][0] = 0; m[0][1] = 1; m[0][2] = -2;
        m[1][0] = 1; m[1][1] = 3; m[1][2] = 0;
        m[2][0] = -2; m[2][1] = 0; m[2][2] = 5;
         */

        m[0][0] = 0;
        m[0][1] = -2;
        m[0][2] = 4;
        m[1][0] = 2;
        m[1][1] = 0;
        m[1][2] = 2;
        m[2][0] = -4;
        m[2][1] = -2;
        m[2][2] = 0;

    }

    public static void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("[" + m[i][j] + "] ");
            }
            System.out.println("");
        }

    }

    public static void transponerMatriz(int[][] m, int[][] mt) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                mt[j][i] = m[i][j];
            }
        }
    }

    public static void verificarSimetria(int[][] m, int[][] mt) {
        int cont = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == mt[i][j] && m[0].length == mt[0].length && m.length == mt.length) {
                    cont++;
                }
            }
        }

        if (cont == m.length * m[0].length) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz es anti simétrica");
        }

    }

}
