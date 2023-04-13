public class zeroInFact {
    public static void main(String[] args) {
        System.out.println(numOfZeros(20));
    }
    

    // method - 1
    // time comp. = O(n+m) = O(n)
    public static int numOfZeros(int n){
        int count = 0 ; 
        int fact = 1 ; 
        if (n==0 || n==1) {
            return 1 ; 
        }
        for(int i =n ; i>0 ; i--){
           fact = fact*i ;
        }

        while(fact>0){
            if(fact%10==0){
                count++ ; 
            }
            fact = fact/10 ; 
        }
        return count ; 
    }



    // method 2
    
}
