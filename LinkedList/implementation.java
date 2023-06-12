public class implementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        // inserting at last in LL
        void insertatend(int val) {
            Node temp = new Node(val);
            if (head == null) { // case for empty LL
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        // InsertAtHead method of LL
        void insertathead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp; // for empty list
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // InsertAtgiven Position

        void insertat(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;

            if (idx == size()) {
                insertatend(val);
                return;
            }
            if (idx == 0) {
                insertathead(val);
                return;
            }
            if (idx < 0 || idx > size()) {
                System.out.println("Invalid index");
                return;
            }
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        // Get At given index
        int getAt(int idx) {
            Node temp = head;
            if (idx < 0 || idx > size()) {
                System.out.println("Invalid index");
                return -1;
            }
            for (int index = 1; index <= idx; index++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // Delete at given index
        void deleteAt(int idx) {
            Node temp = head;
            for (int index = 0; index < idx - 1; index++) {
                temp = temp.next;
            }
            temp = temp.next.next;

        }

        // display function
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        // Size of ll
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            System.out.println();
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertatend(5);
        ll.insertatend(10);
        ll.insertatend(10);
        ll.display();
        System.out.println(ll.size());

        ll.insertathead(2);
        ll.insertathead(9);
        ll.display();
        System.out.println(ll.size());

        ll.insertat(3, 333); // 0 indexing
        ll.display();
        ll.insertat(6, 33); // 0 indexing
        ll.display();
        ll.insertat(-1, 0);
        ll.display();
        System.out.println();
        System.out.println(ll.getAt(2));
        System.out.println(ll.getAt(-2));

        ll.deleteAt(3);
        ll.display();
    }

}
