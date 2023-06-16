public class dltNthNodeFromend {

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

        display(a);
        System.out.println();
        System.out.print("After deleting ->");
        a = dltNth(a,6) ; 
        display(a) ; 
        
    }


    // deleting NthNode from end
         public static Node dltNth(Node head , int n){
            Node fast = head ; 
            Node slow = head ; 

            for(int i=1 ; i<=n ; i++){
                fast = fast.next ; 
            }

            if (fast==null) {
                head = head.next ; 
                return head ; 
            }
            while (fast.next!=null) {
                slow = slow.next ; 
                fast = fast.next ; 
            }
            slow.next = slow.next.next ; 
            return head ; 
        } 


        // display function
        public static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
}
