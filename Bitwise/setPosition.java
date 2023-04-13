public class setPosition {
    public static void main(String[] args) {
        
        // System.out.println(sum(5));

        System.out.println(total(145));
    }

    public static void check(int n){
        int pos = 0 ; 
        while(n>0){
            if (((n>>1)&1)==1) {
                pos++ ; 
                
            }
        }
        System.out.println(pos);
    }

    public static int sum(int n){
         
        if(n==0){
            return 0; 
        }
         return n + sum(n-1) ; 
        
    }

    public static int total(int n){
        int num = 0 ; 
        while(n>0){
          n = n/10 ;
          num++ ; 
        }
        return num ;
    }
}
