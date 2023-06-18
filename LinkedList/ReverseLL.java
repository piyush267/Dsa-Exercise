public class ReverseLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Reverse LL function
    public static Node reverseLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseLL(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Display LL function
    public static void displayLL(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        displayLL(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(22);
        Node c = new Node(32);
        Node d = new Node(42);
        Node e = new Node(52);
        Node f = new Node(62);

        // Connecting nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

        displayLL(a);
        a = reverseLL(a);
        displayLL(a);
    }
}



