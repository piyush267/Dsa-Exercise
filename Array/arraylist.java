import java.util.ArrayList;

class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(10) ; 
        // al.add(5) ; 
        // al.add(10) ; 
       
        for (int index = 1; index < 20; index++) {
            al.add(index) ; 
        }
        System.out.println(al.toArray());
    }
}