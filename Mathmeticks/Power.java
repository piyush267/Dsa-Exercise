public class Power {
    public static void main(String[] args) {
        System.out.println(pow(2, 4));
    }
    
    // time comp. = O(n)
    public static int pow(int b, int p) {
        int res = 1;
        for (int i = 0; i < p; i++) {
            res = res * b;
        }
        return res;
    }
}
