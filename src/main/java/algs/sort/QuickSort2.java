package algs.sort;

/**
 * Created by Nico on 5/27/17 18:25.
 */
public class QuickSort2 {

    public static void sort(int[] a, int start, int end) {
        if (start < end) {
            int low = partition(a, start, end);
            sort(a, start, low -1 );
            sort(a, low + 1, end);
        }
    }

    private static int partition(int[] a, int start, int end) {
        int pivot = a[start];
        while (start < end) {
            while (start < end && a[end] >= pivot) end--;
            swap(a, start, end);
            while (start < end && a[start] <= pivot) start++;
            swap(a, start, end);

        }
        Print.print(a);
        return start;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
