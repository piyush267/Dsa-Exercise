import java.util.HashSet;

public class prefixSum {
    public static void main(String[] args) {
        
    }

    public static boolean givenSum(int[] arr , int sum){

        HashSet<Integer> set = new HashSet<>() ; 
        int pre_sum = 0 ; 

        for(int i=0 ; i<arr.length ; i++){
            if(pre_sum==sum){
                return true ; 
            }
            pre_sum += arr[i];

            if(set.contains(pre_sum-sum)){
                return true ; 
            }
            set.add(pre_sum) ; 

        }
        return false ; 
    }
}
