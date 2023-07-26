public class insertionInArray {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5} ; 
        System.out.println(insertion1(arr));
    }

    // Based on two loops
    public static int insertion1(int[] a){
        int n = a.length ; 
        int count = 0 ; 
        for(int i=0 ; i<n-1 ; i++){
            for(int j=i+1 ;j<n ; j++ ){
                if(a[i]>a[j]){
                    count++ ; 
                }
            }
        }
        return count ; 
    }

    //
}
