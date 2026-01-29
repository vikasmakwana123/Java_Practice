package Practice5_Advance_patterns;
// Pattern to be printed:-
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *
// logic used here is that the spaces would be printed n-i times 
// then the * would be printed (2*i)-1 times after i reaches n then the for loop would end to print the lower haf of the diamond we would reverse the for i loop 
// by starting from n and going to 1 

public class Diamond_pattern {
    public static void main(String[] args) {
        int n=4;
        
        // upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
