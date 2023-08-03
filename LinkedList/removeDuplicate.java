public class removeDuplicate {

    public static void main(String[] args) {
        Node a = new Node(10) ; 
        a.next = new Node(20) ; 
        a.next.next = new Node(20) ; 
        a.next.next.next = new Node(30) ; 
        a.next.next.next.next = new Node(30) ;
        displayLL(a); 
        removeDup(a);
        displayLL(a);

    }


    // Removing duplicates
    public static void removeDup(Node head){
        Node curr = head ; 
        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next = curr.next.next ; 
            }
            else{
                curr = curr.next ; 
            }
        }
    }

    // Display LL
    public static void displayLL(Node head){
        Node curr = head ; 
        while(curr!=null){
            System.out.print(curr.data + " ") ; 
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
