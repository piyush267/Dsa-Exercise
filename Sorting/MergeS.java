public class MergeS {
    public static void main(String[] args) {
        int[] arr = { 7, 20, 4, 11, 8, 2 };
        System.out.println("Array Before Sorting: ");
        printArray(arr);
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        System.out.println("\nArray After Sorting: ");
        printArray(arr);
    }

    // function for merging subarrays
    static void merge(int[] arr, int l, int r, int mid) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;

        for (i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // Function for dividing and sorting recursively
    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, r, mid);
        }
    }

    // Print function
    static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
