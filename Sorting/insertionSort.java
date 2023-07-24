public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4} ; 
        insertion(arr);
        printArray(arr);
    }

    public static void insertion(int[] arr){
        int n = arr.length ; 
        for(int i=1 ; i<n ; i++){
            int j = i ; 

            // Comparing
            while(j>0 && arr[j]<arr[j-1]){
                // swapping
                int temp = arr[j] ; 
                arr[j] = arr[j-1]  ; 
                arr[j-1] = temp ; 
                j-- ; 
            }

        }
    }

    static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
