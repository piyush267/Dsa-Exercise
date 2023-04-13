import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] A = {8 ,9 ,7 ,5 ,3 ,1} ; 
        int[] B = {5 ,4 ,2 ,5 ,1 ,7} ; 
        Arrays.sort(A);   
        Arrays.sort(B);  
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        System.out.println("<------------->");
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
        int ii = 0 ; 
        while(ii<A.length){
            if(A[ii] == B[ii]){
                System.out.println("Same");
            }
        }
        // for(int i=0 ; i<A.length ; i++){
        //     if(A[i] == B[i]){
        //         System.out.println("Same");
        //     }
            
        // }
        // System.out.println("Not same");
    }
}
