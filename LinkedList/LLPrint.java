public class LLPrint {
    
    public static void main(String[] args) {
        // Initialising Our LL
        Node head = new Node(10) ; 
        Node t1 = new Node(20) ; 
        Node t2 = new Node(30) ; 
        Node t3 = new Node(40) ; 
        Node t4 = new Node(50) ; 
        head.next = t1 ; 
        t1.next = t2 ; 
        t2.next = t3 ; 
        t3.next = t4 ; 
        t4.next = null ; 
        // Printing above LinkedList
        printLL(head);

        // LL with one Node
        Node newll = new Node(1000) ; 
        newll.next = null ; 
        printLL(newll);

    }

    public static void printLL(Node head){
        Node curr = head ; 
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next ; 
        }
    }
}


class Node{
    int data ; 
    Node next ; 
    Node(int x){
        data =x ; 
        next = null ; 
    }
}
