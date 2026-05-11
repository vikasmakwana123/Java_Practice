
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiPrac {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 4, 1, 4, 5, 6);
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // s1.forEach(n->System.out.println(n));
        // Stream Can Only be used only once if we try to use the stream again it throws
        // an error
        Stream<Integer> s3 = s2.map(n -> n * 2);
        int result = s3.reduce(0, (c, e) -> c + e);
        System.out.println(result);

        int result1 = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(result);

        // Predicate<Integer> p = new Predicate<Integer>(){
        // public boolean test(Integer n){
        // if (n %2==0){
        // return true;
        // }
        // else
        // return false;
        // }
        // };

        Predicate<Integer> p = n-> n%2==0;

        Function<Integer,Integer> fun = n-> n*2;

        

        int result2 = nums.stream()
                .filter(p)
                .map(fun)
                .reduce(0, (c, e) -> c + e);

        Stream<Integer> sortedValues = nums.parallelStream()//This use Multiple threads for the calculation
                                            .filter(n->n%2==0)
                                            .sorted();
    }
}
