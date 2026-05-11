@FunctionalInterface
interface A {
    int add(int i, int j, int k);
}

public class LambdaExWithReturn {
    public static void main(String[] args) {
        A obj = new A() {
            public int add(int i, int j, int k) {
                return (i + j + k);
            };
        };

        A obj1 = (int i, int j, int k) -> {
            return (i + j + k);
        };

        A obj2 = ( i,  j,  k) ->  (i + j + k);
        

        int result = obj.add(1, 2, 2);
        System.out.println("Result is :- " + result);
    }
}
