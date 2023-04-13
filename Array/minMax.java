public class minMax {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int n = 5;
        int[] arr = { -1, 114, 15, 8, 9 };
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Maximum " + max);
        System.out.println("Minimum " + min);
    }
}
