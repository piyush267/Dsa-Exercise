public class insertSorted {
    public static void main(String[] args) {
        // Initialising Our LL
        Node head = new Node(10);
        Node t1 = new Node(20);
        Node t2 = new Node(30);
        Node t3 = new Node(40);
        Node t4 = new Node(50);
        head.next = t1;
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = null;
        // Printing above LinkedList
        // printLL(head);

        insertInSorted(head, 15);
        printLL(head);

    }

    // Function for adding in sorted way
    public static Node insertInSorted(Node head, int x) {
        Node temp = new Node(x);
        Node curr = head;

        if (head == null) {
            return temp;
        }
        if (head.data >= x) {
            temp.next = head;
            return temp;
        }

        while (curr.next != null && curr.next.data < x) {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;

        return head;
    }

    // Printing function
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