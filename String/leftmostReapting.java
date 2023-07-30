public class leftmostReapting {
    public static void main(String[] args) {
        System.out.println(leftmost1("geeksforgeeks"));
        System.out.println(leftmost1("abcd"));
    }

    public static int leftmost(String s){
        for(int i=0 ; i<s.length()-1 ; i++){
            for(int j=i+1 ; j<s.length() ; j++){
                if(s.charAt(i)==s.charAt(j)){
                    return i ; 
                }
            }
        }
        return -1 ; 
    }

    public static int leftmost1(String s){
        int i=0 ; 
        int j=s.length()-1 ; 

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                i++ ; 
                j-- ; 
            }
            else{
                return i ; 
                
            }
        }
        return -1 ; 
    }
}
