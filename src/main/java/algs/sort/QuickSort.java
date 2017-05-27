package algs.sort;

/**
 * Created by Nico on 5/27/17 00:16.
 */
public class QuickSort {

    public static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int low = partition(a, start, end);
            quickSort(a, start, low - 1);
            quickSort(a, low + 1, end);
        }
    }

    private static int partition(int[] a, int start, int end) {
        int pivot = a[start];
        int low = start, high = end;
        while (low < high) {
            if (a[low] > pivot) {
                swap(a, low, high);
                high--;
            } else {
                low++;
            }
            if (a[high] < pivot) {
                swap(a, low, high);
                low++;
            } else {
                high--;
            }
        }
/*        for (int i = start; i < low - 1; i++) {
            a[i] = a[i + 1];
        }
        a[low - 1] = pivot;*/
        return low;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int a[] = {5, 3, 1, 8, 7, 6, 4};
        quickSort(a, 0, a.length - 1);
        System.out.print(a);
    }
}
