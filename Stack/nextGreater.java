public class nextGreater {
    public static void main(String[] args) {
        int[] a = {1,3,2,1,8,6,3,4} ; 
        int[] temp = func(a) ; 
        arrayPrint(temp);

    }
    public static int[] func(int[] a){
        int[] temp = new int[a.length] ; 

        for(int i=0 ; i<a.length ; i++){
            temp[i] = -1 ; 
            for(int j=i+1 ; j<a.length ; j++){
                if(a[j]>a[i]){
                    temp[i] = a[j] ; 
                    break ; 
                }
                
            }
            
        }
        return temp ; 
    }

    public static void arrayPrint(int[] arr){
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
