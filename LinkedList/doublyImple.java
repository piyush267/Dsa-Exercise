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
}

class Node{
    int data ; 
    Node prev ; 
    Node next ; 

    Node(int x){
        this.data = x ; 
        
    }
}
