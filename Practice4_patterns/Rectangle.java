package Practice4_patterns;
import java.util.Scanner;

// To be printed 

// *****
// *****
// *****
// *****

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for rectangle:- ");
        int row =sc.nextInt();
        System.out.print("Enter the number of rows for rectangle:- ");
        int col =sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
        
    }
    
}
