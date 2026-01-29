package Practice6_functionandMethod;

import java.util.Scanner;

public class Functions {
    public static void printMyName(String name) {
        System.out.println("My name is " + name);
        return;
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int multiply2number(int a,int b){
        int mul = a * b;
        return mul;
    }

    public static void factorial(int n){
        if(n<0){
            System.out.println("Factorial of negative number is not defined.Enter a Valid Number");
            return;
        }else if(n==0){
            System.out.println("The Factorial of 0 is 1");
            return;
        }
        int factorial=1;
        
        for (int i = n; i >= 1; i--) {
            factorial=factorial*i;
            
        }
        System.out.println("The Factorial of "+n+" is "+factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your Name:- ");

        // String name = sc.nextLine();
        // printMyName(name);

        // System.out.print("Enter Your Number 1 for sum:- ");

        // int a = sc.nextInt();
        // System.out.print("Enter Your Number 2 for sum:- ");
        // int b = sc.nextInt();
        // int sum =calculateSum(a, b);
        // System.out.println("The Sum of "+a+" and "+b+" is :- "+sum);

        //  System.out.print("Enter Your Number 1 for multiplication:- ");
        // int a = sc.nextInt();
        // System.out.print("Enter Your Number 2 for multiplication:- ");
        // int b = sc.nextInt();
        // System.out.println("The Multiplication of "+a+" and "+b+" is :- "+multiply2number(a, b));

        System.out.print("Enter a number for factorial calcuation:- ");
        int n =sc.nextInt();
        factorial(n);
        sc.close();
    }
}
