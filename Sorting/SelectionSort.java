public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {7,8,4,2,9,10,1} ;
        selection(a);
        printArray(a);
    }

    public static void selection(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            // Swapping

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
