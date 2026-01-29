package Practice7;

import java.util.Scanner;

public class Voting {
    public static void  Votecalc(int age){
        if (age>18){
            System.out.println("You are Eligible for voting");
        }
        else{
            System.out.println("You are not eligble for voting ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age:- ");
        int age = sc.nextInt();
        Votecalc(age);
        sc.close();
    }
}