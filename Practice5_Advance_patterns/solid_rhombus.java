package Practice5_Advance_patterns;
// Pattern To be printed:-
//      *****
//     *****
//    *****
//   *****
//  *****
// the spaces are always n-i and also they are the first to printed 
public class solid_rhombus {
    public static void main(String[] args) {
        int n =5;
        for (int i = 0; i <n; i++) {
            for (int j = 1; j < (n-i); j++) {
                System.out.print("&");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
