public class BubbleSort {
    public static void main(String[] args) {
        int[] a = { 7, 6, 5, 4, 2 };
        int[] b = {2,1,3,4,5} ; 
        bubble(b);
        printArray(b);
    }

    static void bubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false ; 
            for (int j = 0; j < n - i - 1; j++) {
                // Comparing to adjecent elements
                if (arr[j] > arr[j + 1]) {
                    // Swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true ; 
                }
            }
            // optiising for nearly sorted arrays
            if(flag==false){
                return ; 
            }
        }
    }

    static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
