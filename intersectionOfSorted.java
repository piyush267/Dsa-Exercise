public class intersectionOfSorted {
    public static void main(String[] args) {
        int[] a = {1 , 2,20,40,60} ; 
        int[] b = {2,20,20,20} ; 
        intersection(a, b);
       

    }

    public static void intersection(int[] a , int[] b){
        int p = a.length ; 
        int q = b.length ; 
        int i = 0 ;
        int j = 0 ;  

        while(i<p && j<q){
            if(i>0 && a[i]==a[i-1]){
                i++ ; 
                continue ; 
            }
            else if(a[i]>b[j]){
                j++ ; 
                continue ; 
            }
            else if(a[i]<b[j]){
                i++ ; 
                continue ; 
            }
            else{
                System.out.print(a[i] + " ");
                i++ ; 
                j++ ; 
            }
        }
        
    }

    public static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
