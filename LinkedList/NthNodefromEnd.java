public class NthNodefromEnd {

    // LinkedList defining class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(22);
        Node c = new Node(32);
        Node d = new Node(42);
        Node e = new Node(52);
        Node f = new Node(62);

        // connecting nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;


       // By first approach
       Node op1 = nthNode2(a, 3) ; 
       System.out.println(op1.data);
      
       // By second approach
       Node op2 = nthNode2(a, 3) ; 
       System.out.println(op2.data);
    }

    public static Node nthNode(Node head , int n){
            Node temp = head ; 
            int m = 0 ; 
            while(temp!=null){
                m++ ; 
                temp = temp.next ; 
                
            }

            int num = m - n+1 ; 
            temp = head ; 
            for (int index = 1; index <=num-1; index++) {
                temp = temp.next ; 
            }
            return temp; 
        } 


        // Better approach
        public static Node nthNode2(Node head , int n){
            Node fast = head ; 
            Node slow = head ; 

            for(int i=1 ; i<=n ; i++){
                fast = fast.next ; 
            }
            while (fast!=null) {
                slow = slow.next ; 
                fast = fast.next ; 
            }
            return slow ; 
        } 

         

}