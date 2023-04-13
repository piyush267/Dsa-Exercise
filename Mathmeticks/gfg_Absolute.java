public class gfg_Absolute {
    public static void main(String[] args) {
        System.out.println(absolute(-5));
    }

    public static int absolute(int n){
        if(n<0){
            return n*(-1) ; 
        }
        return n ; 
    }
}
