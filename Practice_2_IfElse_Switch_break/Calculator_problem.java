package Practice_2_IfElse_Switch_break;

import java.util.*;

public class Calculator_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:- ");
        int x = sc.nextInt();
        System.out.println("Enter Number 2:- ");
        int y = sc.nextInt();
        System.out.println(
                "enter 1 for addition of numbers \nenter 2 for subtraction of numbers\nenter 3 for multiplication of numbers\nenter 4 for division of numbers\nenter 5 for remainder of number 1");
        int opreation = sc.nextInt();

        switch (opreation) {
            case 1:
                int sum = x + y;
                System.out.println("The sum of " +  x + "and " + y + " is :-" + sum);
                break;
            case 2:
                int sub = x - y;
                System.out.println("The subtraction of " + x + "and " + y + " is :- " + sub);
                break;
            case 3:
                int mul = x * y;
                System.out.println("The multiplication of " + x + "and " + y + " is :- " + mul);
                break;
            case 4:
                int divide = x / y;
                System.out.println("The division of " + x + "and " + y + " is :- " + divide);
                break;
            case 5:
                int mod = x % y;
                System.out.println("The modulus of " + x + " and " + y + " is :-" + mod);
                break;
            default:
                System.out.println("Please Enter a correct Number");
                break;
        }

        sc.close();

    }
}
