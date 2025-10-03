import java.util.Scanner;

public class MatrizTranspuesta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][2];

        // Pedir la matriz al usuario
        System.out.println("Ingresa los valores para una matriz de 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar matriz original
        System.out.println("\nMatriz original (3x2):");
        imprimirMatriz(matriz);

        // Calcular transpuesta
        int[][] transpuesta = new int[2][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Mostrar transpuesta
        System.out.println("\nMatriz transpuesta (2x3):");
        imprimirMatriz(transpuesta);

        scanner.close();
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}
