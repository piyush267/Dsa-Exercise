public class factorial {
    public static void main(String[] args) {
        fact(3,1) ; 
    }

    // factorial function
    public static void fact(int n , int f){
        if(n==0){
            System.out.println(f);
            return ;
        }
        f = f*n ; 
        fact(n-1 , f) ; 
    }
}

// complexity - time : O(n) ; 
//              space: O(n)
//              auxolary space : O(n) ; 