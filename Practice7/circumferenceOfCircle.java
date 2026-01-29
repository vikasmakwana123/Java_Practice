package Practice7;

import java.util.Scanner;

public class circumferenceOfCircle {
    public static void circumference(int r){
        float circ= 2*(22/7)*r;
        System.out.println("The circumference of circle is:- "+circ);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The radius of the circle to find its circumference:- ");
        int r=sc.nextInt();
        circumference(r);
        sc.close();
    }
    
}
