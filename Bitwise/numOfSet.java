public class numOfSet {
    public static void main(String[] args) {
        System.out.println(totalSet(15));
    }

    public static int totalSet(int n) {
        int count = 0;
        while (n > 0) {
            if ((n  & 1) == 1) {
                count++;
               
            }
            n = n>>1 ; 
        }
        return count;
    }
}
