import java.util.Arrays;

public class Pairofsum {
    public static void main(String[] args) {
        
        int[] arr = {2,4,6,3} ; 
        int x = 55 ; 
        System.out.println(twopoint(arr , 10));
        // Boolean flag = false ; 
        // for (int index = 0; index < arr.length; index++) {
            
        //     for (int i = 1; i < arr.length-1; i++) {
        //         if(arr[index] + arr[i] == x){
        //             flag = true ; 
        //         }
                
        //     }
        // }
        // if(flag==true){
        //    System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }



       
        
        
        
    }
      // using two pointer approach
     static boolean twopoint(int arr[] , int x){
        int low = 0 ; 
        int high = arr.length-1 ; 
        Arrays.sort(arr) ; 
        while (low<=high) {
            if (arr[low]+arr[high]==x) {
                return true ; 
            }
            if (arr[low]+arr[high]>x) {
                high-- ; 
            } else  {
                low++ ; 
            }
        }
        return false ; 
    }
}
