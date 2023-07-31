public class insertAtBegin {

    public static void main(String[] args) {
        
        Node head = null ;
        head = insertBegin(head, 10) ; 
       
        head = insertBegin(head, 20) ; 
       
        head = insertBegin(head, 50) ; 
        printLL(head);
        System.out.println();
        insertEnd(head , 1000) ; 
        printLL(head);
        System.out.println();

        System.out.print("After deleting first: ");
        deleteFirst(head) ; 
        printLL(head);
    }

    // deleting first node
    public static Node deleteFirst(Node head){
        if(head==null){
            return null ; 
        }
        return head.next ; 
    }

    // Function for insertion

    public static Node insertBegin(Node head , int x){
        Node temp = new Node(x) ; 
        temp.next = head ; 
        return temp ; 
    }


    public static Node insertEnd(Node head , int x){
        Node temp = new Node(x) ; 
        
        if(head==null){         // in case of khali LL
            return temp ; 
        }
        Node curr = head ; 
        while(curr.next!=null){
            curr =curr.next ; 
        }
        curr.next = temp ; 
        return head ; 
    }


    public static void printLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
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