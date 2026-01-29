package Practice7;

import java.util.Scanner;

public class three_number_average {
    public static void average(int a, int b, int c) {
        float average = (a + b + c) / 3;
        System.out.println("The Average of the three numbers is :- " + average);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 for average:-");
        int a = sc.nextInt();
        System.out.println("Enter Number 2 for average:-");
        int b = sc.nextInt();
        System.out.println("Enter Number 3 for average:-");
        int c = sc.nextInt();

        average(a, b, c);

        sc.close();
    }
}
