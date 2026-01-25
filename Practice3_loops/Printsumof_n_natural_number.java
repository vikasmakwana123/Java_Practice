package Practice3_loops;
import java.util.*;

public class Printsumof_n_natural_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=6;
        int sum = 0;

        for (int i = 1; i < n+1; i++) {
            sum=sum+i;
        }
        System.out.println("The sum of "+ n +" natural numbers is "+sum);
        
        int user_sum=0;

        System.out.print("Now Using User input ,So Please Enter a Number:- ");
        int a =sc.nextInt();

        for (int i = 1; i < a+1; i++) {
            user_sum=user_sum+i;
        }

         System.out.println("The sum of "+ a +" natural numbers is "+user_sum);
        sc.close();
    }
}
