import java.util.Stack;

public class reverceWordsofString {
    public static void main(String[] args) {
        String s = "Welcome to gfg";
        
    }

    public static void reverceWords(char str[], int n) {
        int start = 0;
        for (int end = 0; end < n; end++) {
            if (str[end] == ' ') {
                reverce(str, start, end - 1);
                start = end + 1;
            }
        }
        reverce(str, start, n - 1);
        reverce(str, 0, n - 1);
    }

    public static void reverce(char str[], int left, int right) {

        while (left < right) {
            // Swap characters at positions left and right
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            // Move pointers inward
            left++;
            right--;
        }
    }
}
