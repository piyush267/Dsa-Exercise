public class digInfact {
    static long facDigits(int N){
        //code here
        long fact = 1 ; 
        if (N==0 || N==1) {
            return 1 ; 
        }
        for(int i =N ; i>0 ; i--){
           fact = fact*i ;
        }
        
        long dig = 0 ; 
        while(fact>0){
            fact = fact/10 ; 
            dig++ ; 
        }
        return dig ; 
    }

    public static void main(String[] args) {
        System.out.println(facDigits(27));
    }
}
