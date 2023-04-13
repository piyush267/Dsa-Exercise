public class AllDeviser {
    public static void main(String[] args) {
        all(100);
    }
    
    // time comp. = O(n)
    // space = O(1)
    public static void all(int n){
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                System.out.println(i);
            }
        }
    }
}
