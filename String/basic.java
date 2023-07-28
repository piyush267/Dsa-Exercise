

public class basic {
    public static void main(String[] args) {
        
        String s1 = "Piyush" ; 
        String s2 = "Piyush" ; 
        String s3 = new String("Piyush") ; 
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        System.out.println(s1.compareTo(s1));

        System.out.println(s1.contains("Piy"));
    }
}
