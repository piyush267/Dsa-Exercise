public class sumOfN {
    public static void main(String[] args) {
        sum(4, 0);
    }

    public static void sum(int n, int total) {

        if (n == 0) {

            System.out.println(total);
            return;
        }
        total = total + n;
        sum(n - 1, total);

    }

}
