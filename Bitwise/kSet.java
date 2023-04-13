import javax.xml.transform.Source;

public class kSet{
    public static void main(String[] args) {
        System.out.println(check2(39,5)); ; 
    }

    public static void check(int n , int k){
        if(((n>>(k-1)) & 1) == 1 ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
    // more accurate solution
    public static boolean check2(int n ,  int k){
        if ((n & (1 <<k)) != 0){
            return true;
        }else{
            return false;
        }
    }
}