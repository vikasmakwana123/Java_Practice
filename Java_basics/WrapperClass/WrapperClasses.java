package Java_basics.WrapperClass;

public class WrapperClasses {
    public static void main(String[] args) {
        int num =7 ;
        Integer num1 = num;//AutoBoxing --> converting a primitive value to its corresponding wrapper class 

        int num2 = num1.intValue();//unboxing
        num2 = num1; //auto-unboxing
        System.out.println(num2);

        String s2 = "23";
        int num3 = Integer.parseInt(s2);

        System.out.println(num3);
    }
    
}