
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            nums.add(new Random().nextInt(100));
        }
        System.out.println(nums);
        int result1 = nums.stream()
                .map(i -> i * 2)
                .reduce(0, (c, e) -> c + e);
        long startSeg = System.currentTimeMillis();
        int result2 = nums.stream()
                .map(i -> i * 2)
                .mapToInt(i -> i)
                .sum();
        long endResult2 = System.currentTimeMillis();
        long startSeg1 = System.currentTimeMillis();
        int result3 = nums.parallelStream()//This takes more time because it takes time for creating threads 
                .map(i -> i * 2)
                .mapToInt(i -> i)
                .sum();
        long endResult3 = System.currentTimeMillis();
        System.out.println();
        System.out.println("Result 1 Using Plain reduce Func:- "+result1);
        System.out.println("Result 2 Using MapToInt Func:-"+result2);
        System.out.println("Result 3 Using parallelStream:- "+result3);
        System.out.println();
        System.out.println("Time took to execute result 2:- "+(endResult2-startSeg));
        System.out.println("Time took to execute result 3:- "+(endResult3-startSeg1));

    }
}
