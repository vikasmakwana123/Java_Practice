import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayList_1 {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(3);
        nums.add(4);
        nums.add(8);
        //If we only want to add and fetch data without indexing we can use Collection else we need to use List 
        List<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(4);
        nums1.add(8);

        System.out.println("Number at Index 1 is :- "+nums1.get(1));
        System.out.println("The Index of Element 8 is  :- "+nums1.indexOf(8));

       for (int n : nums){

            System.out.println(n);
        }

    }
}
