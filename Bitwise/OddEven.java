public class OddEven {
    public static void main(String[] args) {
        check(52) ; 
    }

    // Logic - if Right bit = 1 , number = odd else even ; 
    public static void check(int n){
        if((n&1)==1){
            System.out.println("Odd"); ; 
        }
        else{
            System.out.println("Even");
        }
    }
}
