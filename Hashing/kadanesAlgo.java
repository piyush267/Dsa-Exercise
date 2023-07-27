public class kadanesAlgo {
    public static void main(String[] args) {
        int arr[] = {-3,4,-3,-1,1} ; 
        int ms = Integer.MIN_VALUE ; 
        int cs = 0 ; 

        for (int index = 0; index < arr.length; index++) {
            cs = cs + arr[index] ; 
            if(cs<0){
                cs = 0 ; 
            }

            ms = Math.max(ms,cs); 
        }
        System.out.println(ms);
    }
}
