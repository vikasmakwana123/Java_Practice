package Practice4_patterns;

// Pattern To Be Printed
// *****
// *   *
// *   *
// *****

public class HollowRectangle {
    public void HollowPattern1() {
        // Logic used here is what that the stars are only printed in the extreme value or at the starting value of the loop so using or codition if one codition becomes true then the star will be printed
        int row = 4;
        int col = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || j == 1 || i == row || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 4;
        int col = 5;
        for (int i = 1; i < row + 1; i++) {
            if (i == 1 || i == row) {
                for (int index = 1; index < col + 1; index++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j < col + 1; j++) {
                    if (j == 1 || j == col) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }
        System.out.println("Now Using Youtube method");
        HollowRectangle obj = new HollowRectangle(); 
        obj.HollowPattern1();
    }
}
