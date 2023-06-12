class define{

    // LinkedList defining class
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
        a.next = b ; 
        b.next = c ; 
        c.next = d ; 
        d.next = e ; 
        e.next = f ; 
        
        System.out.println(e.next.data); // e ke next ka data print kro

        // LL direct displaying
        // Node temp = a ; 
        // while(temp!=null){
        //   System.out.print(temp.data + " ");
        //   temp = temp.next ;  
        // }

       
        // normal displaying
        // displayLL(a); 
    
        // recursivly displaying
        dispRec(a) ; 
        
        // printing length
        Length(a);
        
    }


   // length of LL
    public static void Length(Node head){
        
        System.out.print("Length is :");
        int len = 0 ; 
        while(head!=null){
          len++ ; 
          head = head.next ;  
        }
        System.out.println(len);
    }
    // displaying LinkedList through a function

    public static void displayLL(Node head){
        
        System.out.print("Printing with help of function:  ");
        while(head!=null){
          System.out.print(head.data + " ");
          head = head.next ;  
        }
    }

    // displaying LinkedList through recursive call

    public static void dispRec(Node head){
        if(head == null){
            System.out.println("<-- Did recursivly");
            return ; 
        }
        System.out.print(head.data + " ");
        dispRec(head.next) ; 
    }


    // Adding at last in LL
    
    
}

