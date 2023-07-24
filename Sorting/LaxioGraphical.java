public class LaxioGraphical {
     
    public static void main(String[] args) {
        String[] a = {"Papaya" , "Lime" , "Watermelon" ,"Apple" , "Mango" , "Kiwi"} ; 
        LaxioSort(a);
        printArray(a);
    }

    // Problem -> To sort array in lexicographically order
    public static void LaxioSort(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[min_index])<0) {
                    min_index = j;
                }
            }

            // Swapping

            String temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    static void printArray(String[] a) {
        for (String i : a) {
            System.out.print(i + " ");
        }
    }
}


