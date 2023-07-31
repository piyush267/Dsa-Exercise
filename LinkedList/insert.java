public class insert {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(30) ; 
        head.next.next = new Node(50) ; 
        head.next.next.next = new Node(70) ; 

       insertAtGiven(head, 20, 1);
        printLL(head);
    }

    // Insert Function

    public static Node insertAtGiven( Node head ,int x , int pos){
        Node temp = new Node(x) ; 
        Node curr = head ; 
        if(pos==1){
            temp.next = head ; 
            return temp ; 
        }
        for(int i=1 ; i<pos-1 && curr!=null ;  i++){
            curr = curr.next ; 
        }
        if(curr==null){
            return head ; 
        }
        temp.next = curr.next ; 
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