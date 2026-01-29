package Practice5_Advance_patterns;
// Pattern to be printed :-
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

// the logic used here is that first spaces are printed which are always n-i
//  after that the inner loop will run  ((2*i)-1) times because one space is prined in between and the numbers are printed the i times 
//  and the spaces are Printed on every even number of j 

public class Number_pyramid {

    public static void main(String[] args) {
        int n =5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2*i)-1); j++) {
                if(j%2==0){
                    System.out.print(" ");
                }
                else{
                    System.out.print(i);
                }

            }
            System.out.println();
        }
    }
}