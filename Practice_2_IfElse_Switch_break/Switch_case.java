package Practice_2_IfElse_Switch_break;
import java.util.*;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number from 1-3 :-");
        int button = sc.nextInt();

        switch(button){

            case 1: 
                System.out.println("Hello from case 1");
                break;
            case 2: 
                System.out.println("Hello from case 2");
                break;
            case 3: 
                System.out.println("Hello from case 3");
                break;
            default:
                System.out.println("hello From default executed if no condition fulfilled");

        }

        sc.close();
    }
}
