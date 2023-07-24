public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,5,0,3,42};
        moveEnd(arr);
        printArray(arr) ; 
    }

    // Problem -> move zeroes of given array to end in such a way that relative position of other elements should not be change

    public static void printArray(int[] arr) {
        for(int i: arr){
            System.out.print(i + " ") ; 
        }
    }

    public static void moveEnd(int[] a){
        int n = a.length ;

        for(int i=0 ; i<n-1 ; i++){
            for(int j=0 ; j<n-i-1 ; j++){
                if(a[j]==0 && a[j+1]!=0){
                    int temp = a[j] ;
                    a[j] = a[j+1] ; 
                    a[j+1] = temp ; 
                }
            }
        }
    }
}
