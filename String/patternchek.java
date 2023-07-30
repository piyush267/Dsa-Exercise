public class patternchek {
    public static void main(String[] args) {
        pattern("ABCABCDABCD" , "ABCD") ; 
    }

    public static void pattern(String txt , String pat){
        int m = pat.length() ; 
        int n = txt.length() ; 

        for(int i=0 ; i<n-m ; ){
            int j ; 
            for(j=0 ; j<m ;j++){
                if(txt.charAt(i+j)!=pat.charAt(j)){
                    break ; 
                }
            }
            if(j==m){
                System.out.println(i + " ");
            }
            if(j==0){
                i++ ; 
            }
            else{
                i = i + j ; 
            }
        }
    }
}
