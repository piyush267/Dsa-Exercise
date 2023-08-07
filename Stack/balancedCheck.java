import java.util.Scanner;
import java.util.Stack;

public class balancerCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String s = sc.next() ; 
        System.out.println(isBalanced(s)); ; 
    }

    public static Boolean isBalanced(String s){
        Stack<Character> st = new Stack<>() ; 
        int n = s.length() ; 
        for(int i=0 ; i<n ; i++){
            char ch = s.charAt(i) ; 

            if(ch=='('){
                st.push(ch) ; 
            }
            else{
                if(st.size()==0){
                    return false ; 
                }
                else if(st.peek()=='('){
                    st.pop() ;
                }
            }
        }
        if(st.size()>0){
            return false ; 
        }
        else{
            return true ; 
        }
    }
}
