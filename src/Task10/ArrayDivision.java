package Task10;

/*
    1. Создать массив на 20 чисел.
    2. Ввести в него значения с консоли.
    3. Создать два массива на 10 чисел каждый.
    4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayDivision {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void FillArray (int[] array) throws IOException {
        System.out.println("Fill an array: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(READER.readLine());
        }
    }

    public static int[] CopyArrayInRange (int[] mainArray, int start, int end) {
        int newlength = end - start + 1;
        int[] array = new int[newlength];
        for (int i = 0; i < newlength; i++) {
            array[i] = mainArray[start];
            start++;
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        int[] mainArray = new int[20];
        int[] leftArray = new int[10];
        int[] rightArray = new int[10];
        ArrayDivision.FillArray(mainArray);
        leftArray = ArrayDivision.CopyArrayInRange(mainArray, 0,9);
        rightArray = ArrayDivision.CopyArrayInRange(mainArray, 10, 19);
    }
}
