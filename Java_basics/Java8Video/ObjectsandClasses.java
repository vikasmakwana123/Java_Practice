package Java_basics.Java8Video;

class Calc{
    

    public int add(int a,int b){
        System.out.print("Addition of "+a+" and "+b +"is :-");
        return (a+b);
        //if you declare the method to return int then you should return something or else it would throw an error
        //If you don't want to return anything then you can declare the method as void and remove the return statement
    }

}

public class ObjectsandClasses {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        int result = c1.add(4,2);
        System.out.println("Result is :- "+result);
    }
    
}
