import java.util.Stack;

public class StackImplement {
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>() ; 
        for(int i=0 ; i<5 ; i++){
            s.push(i);
        }

        System.out.println(s.isEmpty());
        System.out.println(s.peek());

        for(int i=0 ; i<5 ; i++){
            System.out.print(s.peek() + " ");
            s.pop() ; 
        }
        System.out.println(s.isEmpty());


        
    }
}
