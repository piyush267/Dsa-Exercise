import java.util.HashSet;

class Hashsetfile {
     public static void main(String[] args) {

          HashSet<Integer> h1 = new HashSet<Integer>();

          // add
          for (int index = 0; index < 10; index++) {
               h1.add(index);
          }
          System.out.println(h1);

          // contains
          System.out.println(h1.contains(9));
          System.out.println(h1.contains(11));

          System.out.println(h1.isEmpty());

          for (int index = 0; index < 5; index++) {
               h1.remove(index);
          }

          System.out.println(h1.size());

          h1.clear();
          System.out.println(h1);

     }
}