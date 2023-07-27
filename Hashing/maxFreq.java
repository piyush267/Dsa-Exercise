import java.util.HashMap;

public class maxFreq {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,2,1,4,5,8,7,9,2};

        HashMap <Integer , Integer> freq = new HashMap<>() ; 
        for(int val:arr){
            if(!freq.containsKey(val)){
                freq.put(val,1) ; 
            }else{
                freq.put(val, freq.get(val)+1);
            }
        }
        System.out.println("FreeQuency Map: ");
        System.out.println(freq.entrySet());
    }
}
