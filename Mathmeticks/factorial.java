public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));

        System.out.println(facto(20));
    }
    
    // time comp. = O(n) ; Aux = O(1)
    public static int fact(int n){
        int fact = 1 ; 
        if (n==0 || n==1) {
            return 1 ; 
        }
        for(int i =n ; i>0 ; i--){
           fact = fact*i ;
        }
        return fact ;
    } ; 


    // recursive function for factorial
    // time = O(n) , Aux = O(n)
    public static int facto(int n){
        if(n==1 || n==0){
            return 1 ;
        }
        return n*facto(n-1) ; 
    }
}
