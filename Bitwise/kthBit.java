public class kthBit {
    public static void main(String[] args) {
        System.out.println(check(8,3)) ; 
    }
    public static int check(int n , int i){
        if(((n>>i-1)&1)==1){
            return 1 ; 
        }
        else{
            return 0 ; 
        }
    }
}
