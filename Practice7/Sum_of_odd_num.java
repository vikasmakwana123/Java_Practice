package Practice7;
import java.util.Scanner;
public class Sum_of_odd_num {
    public static void Sum_of_n_odd_num(int n){
        int oddSum=0;
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                oddSum=oddSum+i;
            }
        }
        System.out.println("The sum of n odd numbers is:- "+oddSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till which you want to find the sum of odd numbers:- ");
        int n = sc.nextInt();
        Sum_of_n_odd_num(n);

        sc.close();
    }

}
