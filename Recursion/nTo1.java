public class nTo1{
    public static void main(String[] args) {
      fun(5);
    }

    // recursive function for printing n to 1 ; 
    
    public static void fun(int n){
        // base condition
      if (n==0) {
        return ; 
      }
      System.out.println(n + " ");
      fun(n-1) ;   // recursive call

    }
}

// complexity : 
             // time = 0(n)
             // space = O(1)
             // auxiolary = 0(n)