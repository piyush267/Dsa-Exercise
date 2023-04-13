public class countOfNumbers{
    public static void main(String[] args) {
        count(932);
    }
    public static void count(int n){
        int dig = 0 ; 
        while(n>0){
            n = n/10 ; 
            dig++ ; 
        }
        System.out.println(dig);
    }
}