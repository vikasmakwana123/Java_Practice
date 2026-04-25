package Java_basics.Java10Video;

class Calculator{
    // Method Overloading means having methods with same name but accepting diffrent numbers or diffrent types of parameter
    int num; //instance variable

    public double  add(double a , int b){
        return a+b;//a and b are called a local variable
    }

    public int add(int a , int b){
        return a+b;
    }

    public int add(int a, int b ,int c){
        return a+b+c;
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int result = obj.add(2, 3);
        System.out.println("The addition of 2 and 3 is "+result);
        
    }
    
}
