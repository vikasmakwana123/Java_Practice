package Practice7;
import java.util.*;

public class GreaterNum {
    public static int Greater2Num(int a ,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 to find which is greater:-  ");
        int a=sc.nextInt();
        System.out.print("Enter Number 2 to find which is greater:-  ");
        int b=sc.nextInt();

        int result=Greater2Num(a, b);
        System.out.println("The Greater Number from "+a+" and "+b+" is:- "+result);

        sc.close();
    }
    
}
