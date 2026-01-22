package Practice_2_IfElse_Switch_break;

import java.util.Scanner;

public class Greater_lesser {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Number 1:- ");
        int x = sc.nextInt();

        System.out.print("Enter Number 2:- ");
        int y = sc.nextInt();

        if(x >y){
           System.out.println("The number " + x + " is greater than " + y);
        } else if(x < y){
             System.out.println("The number " + x + " is lesser than " + y); 
        }
        else{
            System.out.println("Both numbers are equal: " + x + " and " + y);
        }

        sc.close();
    }
}
