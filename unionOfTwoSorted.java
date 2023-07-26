import java.util.Arrays;

public class unionOfTwoSorted {
    public static void main(String[] args) {
        int[] a = {1 , 2,20,40,60} ; 
        int[] b = {2,20,20,20} ; 
        System.out.println("Using direct method: ");
        union1(a, b);
        System.out.println();
        System.out.println("Using merge type method: ");
        union2(a, b);
    }

    // Based on merge method type
    public static void union2(int[] a , int[] b){
        int n1 = a.length ; 
        int n2 = b.length ; 

        int i = 0 ; 
        int j = 0 ; 

        while(i<n1 && j<n2){
            if(i>0 && a[i]==a[i-1]){
                i++ ; 
                continue ; 
            }
            if(j>0 && b[j]==b[j-1]){
                j++ ; 
                continue ; 
            }

            if(a[i]<b[j]){
                System.out.print(a[i] + " ");
                i++ ; 
            }
           else if(a[i]>b[j]){
                System.out.print(b[j] + " ");
                j++ ; 
            }
            else{
                System.out.print(a[i]+" ");
                i++ ; 
                j++ ; 
            }
        }
        while(i<n1){
            System.out.print(a[i] + " ");
            i++ ; 
        }
        while(j<n2){
            System.out.print(b[j] + " ");
            j++ ; 
        }
    }


    public static void union1(int[] a , int[] b){
       int n1 = a.length ; 
       int n2 = b.length ; 

       int[] temp = new int[n1+n2+1] ; 
        int k = 1 ; 
       for(int i=0 ; i<n1 ; i++){
        temp[k] = a[i] ; 
        k++ ; 
       }
       for(int j=0 ; j<n2 ; j++){
        temp[k] = b[j] ; 
        k++ ; 
       }

       Arrays.sort(temp) ; 

       for(int i=0 ; i<temp.length ; i++){
        if(i==0 || temp[i]!=temp[i-1]){
            System.out.print(temp[i] + " ");
        }
    }
}
}