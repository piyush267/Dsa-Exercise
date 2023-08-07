import java.util.ArrayList;
import java.util.Stack;

public class removeConsecutive {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 10, 10, 4, 4, 4, 5, 7, 7, 2 };
        int[] temp = subsequences(arr);
        arrayPrint(temp);
    }

    public static int[] subsequences(int[] arr) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> arls = new ArrayList<>();

        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (!st.isEmpty() && arr[i] != st.peek()) {
                st.push(arr[i]);
            }
        }
 
        while (!st.isEmpty()) {
            arls.add(st.pop());
        }

        int[] temp = new int[arls.size()];
        int count = 0;
        for (int i = arls.size() - 1; i >= 0; i--) {
            temp[count] = arls.get(i);
            count++;
        }
        return temp;

    }

    public static void arrayPrint(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
