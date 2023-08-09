public class ArrayImplementation {
    public static void main(String[] args) {
        Que q = new Que(5);
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);

        System.out.println("Queue elements after enqueuing:");
        q.printQueue();

        q.deque();
        System.out.println(q.isEmpty());
        System.out.println("Queue elements after dequeuing:");
        q.printQueue();
    }
}

class Que {
    int size;
    int cap;
    int[] arr;

    Que(int c) {
        cap = c;
        size = 0;
        arr = new int[cap];
    }

    boolean isFull() {
        return (size == cap);
    }

    boolean isEmpty() {
        return (size == 0);
    }

    void enque(int x) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + x);
            return;
        }
        arr[size] = x;
        size++;
    }

    void deque() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0; // Clear the last element
        size--;
    }

    int getfront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[0];
    }

    int getrear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[size - 1];
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
