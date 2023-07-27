import java.util.* ; 
public class hashmapImplement {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1) ; 
        map.put("B", 2) ; 
        map.put("C", 3) ; 
        map.put("D", 4) ; 
        map.put("E", 5) ; 

        System.out.println("Size of map is :" + map.size());
        // Get method takes key and prints value
        System.out.println(map.get("D"));  //4

        // Remove Method takes key and prints value
        map.remove("E") ; 
        System.out.println(map.get("E"));  // null

        // Check if there key is or not
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("H"));
        
        System.out.println(map.containsValue(3));

        
    }
}
