public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcdNum(12, 16));
    }

    public static int gcdNum(int a , int b){
        
       
        int res = Math.min(a, b) ; 

        while(res>0){
            if(a%res==0 && b%res==0){
                break ; 
            }
            res-- ; 
        }
        return res ; 
    }
}
