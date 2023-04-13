public class rotateArray {
    public static void main(String[] args) {
        
    }

    // method 1
    public static void method1(int arr[] , int n , int d){
        int[] temp = new int[d] ; 
        for(int i=0 ; i<d ; i++){
            temp[i] = arr[i] ; 
        }
        
        for(int i=d ; i<n ; i++){
            arr[i-d]=arr[i] ; 
        }
        
        for(int i=0 ; i<d ; i++){
            arr[n-d+i] = temp[i] ; 
        }
    }


    
}
