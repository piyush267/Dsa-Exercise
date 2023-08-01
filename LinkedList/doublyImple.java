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
     // for inserting at last
     public static Node insertAtLast(Node head , int x){
        Node temp = new Node(x) ; 

        Node curr = head ; 

        if(curr==null){
            head = temp ; 
            return head ; 
        }
        while(curr.next!=null){
            curr = curr.next ; 
        }
        curr.next = temp ; 
        temp.prev = curr ; 

        return head ; 
    }

    // for printing the LL
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    
    // revercing doubly LL

    public static Node reverce(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.next;
        }
        return prev;
    }
    // Deleting last node
       public static Node deleteLast(Node head){
        Node curr = head ; 
        if(head==null||head.next==null){
            return null ; 
        }
        while(curr.next.next!=null){
            curr = curr.next ; 
        }
        curr.next = null ; 
        return head ; 
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
