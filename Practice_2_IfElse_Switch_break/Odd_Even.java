package Practice_2_IfElse_Switch_break;
import java.util.*;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number To Chcek If The Number Is Even:-  ");
        int x= sc.nextInt();
        if( x % 2 ==0 ){
            System.out.println("The Number is Even");
        }else{
            System.out.println("The Number Is Odd");
        }
        sc.close();
    }
}
