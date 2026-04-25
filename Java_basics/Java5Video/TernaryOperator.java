package Java_basics.Java5Video;

public class TernaryOperator {
    public static void main(String[] args) {
        int a =10;
        int result =0;
        if(a>10){
            result =10;
        }
        else{
            result =20;
        }
        System.out.println("Result using if-else :- "+result);

        //Using Ternary Operator  ?:

        result = (a>10) ? 34: 23;
        System.out.println("Result using ternary operator :- "+result);

        result =(a%2==0)? (a*2 == 20 ? 100 : 200) : (a*3 == 30 ? 300 : 400);
        System.out.println("Result using nested ternary operator :- "+result);
    }
    
}
