
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamApiNeed {
    public static void main(String[] args) {
        List <Integer> nums = Arrays.asList(1,3,7,5,32,12,4);
        nums.forEach(n->System.out.println(n));
        
        int sum =0;
        for (int n : nums){
            if(n%2==0){
                n= n*2;
                sum = sum+n;
            }
        }
        System.out.println(sum);

        Consumer <Integer> con = n->System.out.println(n);
        nums.forEach(con);


    }
}
