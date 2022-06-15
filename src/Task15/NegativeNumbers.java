package Task15;

/*
    Дан двумерный массив, содержащий отрицательные и положительные числа.
    Выведете на экран номера тех ячеек массива, которые содержат отрицательные числа
*/

public class NegativeNumbers {
    public static void FindNegative(int[][] matrix) {
        System.out.print("Array cells containing negative numbers: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    System.out.print("(" + i + ", " + j + ") ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,-1, 2, 3, 5, -6, 7, -8},
                {9, -10, 11, 12, -13, 14, -15, 16}};
        FindNegative(matrix);
    }
}
