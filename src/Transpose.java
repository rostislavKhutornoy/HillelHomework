import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Transpose {
    int matrix[][];
    int rows;
    int cols;

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private int getNumber() throws IOException {
        int number = 0;
        boolean valid = true;
        while (valid) {
            try {
                number = Integer.parseInt(READER.readLine());
                break;
            } catch (Exception exception) {
                valid = false;
                System.out.println("Invalid input, please enter a numeric value!");
            }
        }
        return number;
    }

    public int[][] CreateMatrix() throws IOException {
        System.out.println("Enter the number of rows: ");
        rows = getNumber();
        System.out.println("Enter the number of cols: ");
        cols = getNumber();
        matrix = new int[rows][cols];
        System.out.println("Fill the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("(" + i + ", " + j + "): ");
                matrix[i][j] = getNumber();
            }
        }
        return matrix;
    }

    public int[][] TransposeMatrix() {
        int[][] transposeMatrix = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        matrix = transposeMatrix;
        int temp = rows;
        rows = cols;
        cols = temp;
        return matrix;
    }

    public void DisplayMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        Transpose example = new Transpose();
        example.CreateMatrix();
        example.DisplayMatrix();
        example.TransposeMatrix();
        example.DisplayMatrix();
    }
}
