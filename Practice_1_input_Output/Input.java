import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:- ");
        String name = sc.next(); // Takes one word as input
        System.out.println("Hello how are you "+name);

        String sentence = sc.nextLine(); // Takes multiple words as input
        System.out.println("You entered this sentence:- "+sentence);
        /* 
         Multi-line comment example:
         Enter your name:- vikas makwana
         hello world full sentence
         You entered this sentence:- makwana hello world full sentence
        */
       
         //nextInt() for interger input
        //nextDouble() for double input
        //nextFloat() for float input
        //nextBoolean() for boolean input
    }
}
