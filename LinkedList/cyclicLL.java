public class cyclicLL {
    public static class Node{
        int data ; 
        Node next ; 

        Node(int data){
            this.data = data ; 
        }
   }
    public static void main(String[] args) {
        Node a = new Node(12) ; 
        Node b = new Node(22) ; 
        Node c = new Node(32) ; 
        Node d = new Node(42) ; 
        Node e = new Node(52) ; 
        Node f = new Node(62) ; 

       // connecting nodes
       // this is a cyclic linked list. will never end. when it will finish its first traversal at E it will again start from A
        a.next = b ; 
        b.next = c ; 
        c.next = d ; 
        d.next = e ; 
        e.next = a ; 

        System.out.println(checkLL(a));
    }

    // inserting at begining of LL
    public static Node insertAtStart(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
        } else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
        }

        return temp;

    }
    
   // printing Doubly linkedlist
    public static void displayLL(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        System.out.print("Printing with help of function: ");

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }


    // function for check if given LL is cyclic or not
    public static boolean checkLL(Node head){
        if(head.next==null){
            return false ; 
        }
        Node slow = head ; 
        Node fast = head ; 
        while(fast!=null){
            slow = slow.next ; 
            fast = fast.next.next ;
            if (slow==fast) {
                return true ; 
            }
        }
        return false ; 

    }
}
