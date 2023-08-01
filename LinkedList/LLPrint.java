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
    
    // printing Nth from last of the LL
    public static void nthFromLast(Node head, int n) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        curr = head;
        if(count<n){
            return ; 
        }
        
        int i = 1;
        int pr = count - n + 1;
        while (i < pr) {
            curr = curr.next;
            i++;
        }
        System.out.println(curr.data);

    }
     // printing middle of LL
    public static void middleLL(Node head){
        Node curr = head ; 
        if(head==null){
            System.out.println("  ");
            return ; 
        }
        if(head.next==null){
            System.out.println("Middle element of LL is : " +head.data);
            return ; 
        }
        int count = 0 ; 
        while(curr!=null){
            count++ ; 
            curr = curr.next ; 
        }
        curr = head ; 
        int ref = count/2 ; 
        int i=0; 
        while(i<ref){
            curr = curr.next ; 
            i++ ; 
        }
        System.out.println();
        System.out.println("Middle element of LL is : " + curr.data);
        return  ;
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
