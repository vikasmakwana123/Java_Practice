import java.util.*;

public class NumberInputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a for sum:");
        int a = sc.nextInt();
        System.out.println("Enter number b for sum:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of a and b is: " + sum);
    }
}
