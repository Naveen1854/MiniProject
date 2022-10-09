import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 2, 1, 6 };
        print(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        print(Arrays.toString(array));
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
