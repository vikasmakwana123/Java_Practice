package Practice_2_IfElse_Switch_break;

import java.util.*;

public class Month_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Your Month :- ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("The Month is january");
                break;
            case 2:
                System.out.println("The Month is febraury");
                break;
            case 3:
                System.out.println("The Month is march");
                break;
            case 4:
                System.out.println("The Month is april");
                break;
            case 5:
                System.out.println("The Month is may");
                break;
            case 6:
                System.out.println("The Month is june");
                break;
            case 7:
                System.out.println("The Month is july");
                break;
            case 8:
                System.out.println("The Month is august");
                break;
            case 9:
                System.out.println("The Month is september");
                break;
            case 10:
                System.out.println("The Month is october");
                break;
            case 11:
                System.out.println("The Month is november");
                break;
            case 12:
                System.out.println("The Month is december");
                break;

            default:
                System.out.println("Please Enter a corrrect number");
                break;
        }

    }

}
