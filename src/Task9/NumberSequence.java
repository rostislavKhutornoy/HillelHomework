package Task9;

/*
    Пользователь задает последовательность целых чисел.
    Сохраните ее в массив.
    Узнать является ли последовательность строго возрастающей.

    Строго возрастающая последовательность означает, что каждое следующее число больше предыдущего.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSequence {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static int[] CreateAndFill () throws IOException {
        System.out.println("Enter the size of the array: ");
        int cellCount = Integer.parseInt(READER.readLine());
        int[] array = new int[cellCount];
        System.out.println("Fill an array: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(READER.readLine());
        }
        return array;
    }

    public static void isIncreasing(int[] array) {
        boolean isIncreasing = true;
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i+1]) {
                isIncreasing = false;
            }
        }
        if (!isIncreasing) {
            System.out.println("The sequence does not increase!");
        } else System.out.println("The sequence is increasing.");

    }

    public static void main(String[] args) throws IOException {
        int[] array = NumberSequence.CreateAndFill();
        NumberSequence.isIncreasing(array);
    }
}
