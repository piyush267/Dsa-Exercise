public class Prime {
    public static void main(String[] args) {
        System.out.println(checkPrime(13));
    }

    // time = O(n)
    public static boolean checkPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;

            }

        }
        return true;
    }
}
