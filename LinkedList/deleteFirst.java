public class deleteFirst {
    public static Node deleteFirst(Node head) {
        if (head == null) {
            return null;
        }
        head = head.next; // Update the head pointer to the next node
        return head;
    }
    

    public static void printLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node t1 = new Node(20);
        Node t2 = new Node(30);
        Node t3 = new Node(40);
        Node t4 = new Node(50);
        head.next = t1;
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = null;

        deleteFirst(head);
        printLL(head);

    }


    // delete LAST
    public static Node deleteLast(Node head){
       
        
        if(head==null){         // in case of khali LL
            return null ; 
        }
        Node curr = head ; 
        while(curr.next.next!=null){
            curr =curr.next ; 
        }
        curr.next = null  ; 
        return head ; 
    }

}

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}