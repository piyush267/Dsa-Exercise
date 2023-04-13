public class palndrome {
    public static void main(String[] args) {
        checkpal(121);
    }

    public static void checkpal(int n){
        int temp = n ; 
        int rev = 0 ; 
        while(temp>0){
            int lastDigit = temp%10 ; 
            temp = temp/10 ; 
            rev = rev*10 + lastDigit ; 
        }
        if (n == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

// time comp. = O(n)