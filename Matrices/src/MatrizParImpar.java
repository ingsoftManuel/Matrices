import java.util.Random;

public class MatrizParImpar {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4]; // Matriz 4x4
        Random random = new Random();  // Para generar números aleatorios

        int pares = 0;
        int impares = 0;

        // Llenar la matriz con números aleatorios entre 1 y 100
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100) + 1; // entre 1 y 100

                // Contar si es par o impar
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz 4x4 con números aleatorios:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar los resultados
        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
