import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class qReverce {
    public static void main(String[] args) {
         Queue<Integer> q = new LinkedList<>() ; 
        q.add(10) ; 
        q.add(20) ; 
        q.add(30) ; 
        System.out.println(q.peek());
        
        Queue<Integer> p ; 
        
        System.out.println(q.peek());
    }

    public static void QuReverce(Queue<Integer> q){
         
        Stack<Integer> s = new Stack<>() ; 

        while(q.isEmpty()){
            s.push(q.remove()) ; 

        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
}
