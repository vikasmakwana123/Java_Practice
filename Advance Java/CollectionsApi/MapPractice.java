
import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String,Integer> nums = new HashMap<>();
        nums.put("Vikas",6);
        nums.put("Rajesh",3);
        nums.put("Navin",4);
        nums.put("Kamlesh",8);
        nums.put("Vikas",10);
        //keys cannot be repeated  in a map and keys can be called as a set and values can be called as a list because difrrent keys can have same values but same keys cannot have diffrent values
        System.out.println(nums);
        System.out.println(nums.get("Rajesh"));
        System.out.println(nums.get("Vikas"));
        System.out.println(nums.keySet());
        for(String name: nums.keySet()){
            System.out.println(name+" : "+nums.get(name));
        }
    }
}
