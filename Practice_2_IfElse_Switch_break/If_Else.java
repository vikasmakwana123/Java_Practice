package Practice_2_IfElse_Switch_break;

import java.util.*;

public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age:- ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are not an Adult");
        }

        sc.close();
        
    }
}