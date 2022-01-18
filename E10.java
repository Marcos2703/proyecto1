

import java.util.InputMismatchException;
import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        int i = 0, o = 0;
        // Valor distinto de 0 para columnaA para no saltar de línea al llegar al if.
        int filaA = 0, columnaA = 999;
        int filaB = 0, columnaB = 0;
        int filaC = 0, columnaC = 0;
        Scanner sc = new Scanner(System.in);
        Boolean valorcorrecto = true;
        int valorC = 0;

        // Vamos a forzar que se tengan que introducir valores válidos.
        while (valorcorrecto) {
            try {
                System.out.println("Escriba el número de filas de la matriz A: ");
                filaA = sc.nextInt();

                System.out.println("Escriba el número de columnas de la matriz A: ");
                columnaA = sc.nextInt();

                System.out.println("Escriba el número de filas de la matriz B: ");
                filaB = sc.nextInt();

                System.out.println("Escriba el número de columnas de la matriz B: ");
                columnaB = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("     Error, tiene que ser un valor Integer.");
                sc.next();
            }

            /*
             * Para poder hacer el producto de dos matrices se tiene que cumplir
             * que la cantidad de columnas de la primera matriz sea igual que la
             * cantidad de filas de la segunda matriz.
             * ¡En el caso de las matrices, el orden SI afecta al producto!
             */
            if (columnaA == filaB) {
                valorcorrecto = false;
            } else {
                System.out.println("Error, tiene que haber tantas columnas en la matriz A como filas en la matriz B.");
            }
        }

        filaC = filaA;
        columnaC = columnaB;

        int[][] matrizA = new int[filaA][columnaA];
        int[][] matrizB = new int[filaB][columnaB];
        int[][] matrizC = new int[filaC][columnaC];

        // Recogemos los valores de la matriz A.
        for (i = 0; i < filaA; i++) {

            for (o = 0; o < columnaA; o++) {
                System.out.printf("%n Escriba el valor de la posición [%d][%d] de la primera matriz: ", i + 1, o + 1);
                matrizA[i][o] = sc.nextInt();
            }

            // Recogemos los valores de la matriz B.
            for (i = 0; i < filaB; i++) {

                for (o = 0; o < columnaB; o++) {
                    System.out.printf("%n Escriba el valor de la posición [%d][%d] de la segunda matriz: ", i + 1,
                            o + 1);
                    matrizB[i][o] = sc.nextInt();
                }

            }

            for (i = 0; i < filaC; i++) {

                System.out.println();
                for (o = 0; o < columnaC; o++) {
                    valorC = 0;
                    valorC = valorC + (matrizA[i][o] * matrizB[o][i]);
                    matrizC[i][o] = valorC;
                    System.out.print(" " + matrizC[i][o]);
                }

            }

        }
    }
}