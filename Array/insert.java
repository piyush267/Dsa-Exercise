public class insert {
    public static void main(String[] args) {
        
    }
    public static int insertele(int arr[] , int n , int x , int cap , int pos){
        if(n==cap){
            return -1; 
        }
        int idx = n-1 ; 
        for (int index = n-1; index>=idx; index--) {
            arr[index+1] = arr[index] ; 
        }
        arr[idx] = x ; 
        return n+1 ; 
    }
}
