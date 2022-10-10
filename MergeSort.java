public class MergeSort {

    public static void main(String[] args) {
        {
            int[] array = { 6, 5, 4, 3, 2, 1 };

            mergeSort(array);

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + " ");
            }
        }
    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1)
            return;

        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        int i = 0;
        int j = 0;

        for (; i < length; i++) {
            if (i < mid) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftarray, int[] rightarray, int[] array) {

        int leftsize = array.length / 2;
        int rightsize = array.length - leftsize;
        int i = 0, l = 0, r = 0;
        while (l < leftsize && r < rightsize) {
            if (leftarray[l] < rightarray[r]) {
                array[i++] = leftarray[l++];
            } else {
                array[i++] = rightarray[r++];
            }
        }
        while (l < leftsize) {
            array[i++] = leftarray[l++];
        }
        while (r < rightsize) {
            array[i++] = rightarray[r++];
        }
    }
}
