import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Enter anything:-");
        try {
                int num = System.in.read();//This gives the number in ascii value and it reads a ssingle value at a time
                System.out.println(num);

                InputStreamReader in = new InputStreamReader(System.in);
                BufferedReader bf = new BufferedReader(in);
                int num1 = Integer.parseInt(bf.readLine());
                System.out.println(num1);

                //Buffer reader can be used to read files and read networks etc so when we read a resource we need to close that resousre 
                bf.close();


                Scanner sc = new Scanner(System.in);
                int num2 = sc.nextInt();
                System.out.println(num2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
