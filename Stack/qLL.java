import java.util.LinkedList;
import java.util.Queue;

public class qLL {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() ; 
        q.add(10) ; 
        q.add(20) ; 
        q.add(30) ; 
        System.out.println(q.peek());
        q.clear() ; 
        System.out.println(q.peek());
    }
}
