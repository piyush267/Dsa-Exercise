import java.util.HashSet;

public class Unionfile {
    public static void main(String[] args) {
        int a[] = {3,3,3} ; 
        int b[] = {3,3} ; 

        HashSet<Integer> s = new HashSet<Integer>() ; 
        for (int index = 0; index < a.length; index++) {
            s.add(a[index]) ; 
        }

        for (int index = 0; index < b.length; index++) {
            if (!s.contains(b[index])) {
                s.add(b[index]) ; 
            } 
        }

        System.out.println(s.size());
    }
}
