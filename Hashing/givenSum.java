public class givenSum {
    public static void main(String[] args) {
        int[] arr = { 11, 5, 6 };
        System.out.println(isEqualGiven(arr, 10));
    }

    public static boolean isEqualGiven(int[] arr, int sum) {
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return true ; 
                }
            }
        }
        return false;
    }
}
