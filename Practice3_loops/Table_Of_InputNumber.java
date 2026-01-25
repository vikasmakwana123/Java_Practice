package Practice3_loops;
import java.util.Scanner;

public class Table_Of_InputNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number of which you want the table to be printed:- ");
        int num=sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num+"x"+i+"="+num*i);
        }
        System.out.println("Table Printed successfully");
        sc.close();
    }
}
