import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(6);
        nums.add(3);
        nums.add(4);
        nums.add(8);
        nums.add(10);
        nums.add(3);
        nums.add(200);
        nums.add(230);
        nums.add(3444);
        nums.add(137);
        // Hash set is not organized and does not support indexing

        Set<Integer> nums1 = new TreeSet<Integer>();
        nums1.add(6);
        nums1.add(3);
        nums1.add(4);
        nums1.add(8);
        nums1.add(10);
        nums1.add(3);
        nums1.add(200);
        nums1.add(230);
        nums1.add(3444);
        nums1.add(137);
        // TreeSet is Organized data set
        for (int n : nums) {
            System.out.println("From Hash Set:- " + n);

        }
        System.out.println("");
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext())
            System.out.println(values.next());
    }
}
