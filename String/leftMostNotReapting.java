import java.util.HashMap;

public class leftMostNotReapting {
    public static void main(String[] args) {
        System.out.println(leftmost2("geeksforgeeks"));
        System.out.println(leftmost2("abcda"));
    }

    public static int leftmost2(String s){
        final int CHAR = 256 ; 
        int[] count = new int[CHAR] ; 
        for(int i=0 ; i<s.length() ; i++){
            count[s.charAt(i)]++ ; 
        }
        for(int i=0 ; i<s.length() ; i++){
            if(count[s.charAt(i)]==1){
                return i ; 
            }
        }
        return -1 ; 
    }

    
    public static int leftmost(String s){
        
       
        for(int i=0 ; i<s.length() ; i++){
             boolean flag = false ; 
            for(int j=0 ; j<s.length() ; j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    flag = true ; 
                    break ; 
                }
            }
            if(flag == false){
                return i ; 
            }
        }
        return -1; 
    }

}
