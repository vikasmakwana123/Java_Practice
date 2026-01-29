package Practice5_Advance_patterns;
// Pattern to be printed:-
//     1
//    212
//   32123
//  4321234
// 543212345

// logic used here is that the spaces would be always n-i 
// then number would be printed for which the loop would from i to 1 
// after 1 is reached the loop will end then another loop willl start  which will go from 2 to i because 1 is always present
public class Palindromic_Pattern_Pyramid {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j>=1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
