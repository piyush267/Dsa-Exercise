public class doublyImple {
    public static void main(String[] args) {
        Node a = new Node(10) ; 
        Node b = new Node(20) ; 
        Node c = new Node(30) ; 

        a.next = b ; 
        a.prev = null ; 
        b.next = c ; 
        b.prev =a ; 
        c.prev = b ; 
    }
}

class Node{
    int data ; 
    Node prev ; 
    Node next ; 

    Node(int x){
        this.data = x ; 
        
    }
}
