package ödev;
import java.util.Arrays;
import java.util.Random;

public class alper {

    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix(3, 3);
        System.out.println("Orijinal Matris:");
        printMatrix(matrix);

        sortMatrix(matrix);

        System.out.println("\nSıralanmış Matris:");
        printMatrix(matrix);
    }

    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(101);
            }
        }
        return matrix;
    }

    public static void sortMatrix(int[][] matrix) {
        int[] flatMatrix = new int[matrix.length * matrix[0].length];
        int index = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                flatMatrix[index++] = value;
            }
        }
        Arrays.sort(flatMatrix);

        index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = flatMatrix[index++];
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
