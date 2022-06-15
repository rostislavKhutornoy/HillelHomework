package Task12;

/*
    Задан массив целых чисел. Поместить все нули в начало массива.
    Например дано {х,х,0,х,0,х}, в результате получаем {0,0,х,х,х,х}, порядок ненулевых чисел значения не имеет.
*/

public class Zero {
    public static void ZeroSort(int[] array) {
        for(int x = 0; x < array.length; x++) {
            for(int i = 0; i < array.length - 1; i++) {
                if (array[i] != 0 && array[i+1] == 0) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 0, 3, 0, 6, 7, 8, 0, 0, 0, 35, 2, 0, 9, 54, 2, 0, 6, 0};
        Zero.ZeroSort(array);
    }
}
