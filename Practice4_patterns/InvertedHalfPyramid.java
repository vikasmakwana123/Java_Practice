package Practice4_patterns;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n = 4; // number of rows

        for (int i = 1; i <= n; i++) {
            // print spaces first
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // then print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // move to next line
            System.out.println();
        }
    }
}
