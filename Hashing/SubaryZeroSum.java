public class SubaryZeroSum {
    public static void main(String[] args) {
        int[] a = {1,2,3,4} ; 
        System.out.println(zeroSum(a));
    }

    public static boolean zeroSum(int[] a){
        for(int i=0 ; i<a.length-1 ; i++){
            int cur_sum = 0 ; 

            for(int j=i+1 ; j<a.length ; j++){
                cur_sum = cur_sum + a[j] ; 

                if(cur_sum == 0){
                    return true ; 
                }
            }
        }
        return false ; 
    }
}
