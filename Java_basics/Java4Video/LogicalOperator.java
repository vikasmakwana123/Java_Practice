package Java_basics.Java4Video;

public class LogicalOperator {
    public static void main(String[] args) {
        int a =3;
        int b =4;
        int x =4;
        int y =23;

        boolean result = (a>b) && (x>y);
        System.out.println("Result of Logical AND operator :- "+result);

        boolean result2 = (a>b) || (x>y);
        System.out.println("Result of Logical OR operator :- "+result2);

            boolean result3 = !(a>b);
            System.out.println("Result of Logical NOT operator :- "+result3);
    }
}
