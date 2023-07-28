

public class palindromeCheck {
    public static void main(String[] args) {
        System.out.println(palCheck2("ABCBA"));

    }

    public static boolean palCheck(String str){
        StringBuilder rev = new StringBuilder(str) ; 

        rev = rev.reverse() ; 
        String res = rev.toString() ; 

        return str.equals(res) ; 
    }

    public static boolean palCheck2(String s){
        int begin = 0 ; 
        int end = s.length()-1 ; 
        while(begin<end){
            if(s.charAt(begin)!=s.charAt(end)){
                return false ; 
            }
            begin++ ; 
            end-- ; 


        }
        return true ; 
    }
}
