public class delete {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5} ; 
        int n = 3 ; 
        int idx = n-1 ; 
        for(int i = idx ; i<arr.length ; i++){
            arr[i] = arr[i-1] ; 
             

        }
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
    }
}
