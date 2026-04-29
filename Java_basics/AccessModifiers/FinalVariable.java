package Java_basics.AccessModifiers;

final class A{
    public void show(){
        System.out.println("Hi from class A");
    }
}
class C{
    public final void show(){
        System.out.println("Hi from class A");
    }
    public int add(int a , int b){
        System.out.println(a+b);
        return a+b;
    }
}

// class B extends A{
//     public void show(){
//         System.out.println("hi from class B");
//     }
// } Cannot extend a final class This stop inheritance

class D extends C{
    // public void show(){
    //     System.out.println("This is Show method from Class D");
    // } Cannnot over ride the method of a extended class 

    public int add(int a , int b){
        System.out.println(a+b);
        return a+b;
    }//can overriide this method bacuse it is not  declared as a final method
}

public class FinalVariable {
   public static void main(String[] args) {
    final int num =8;
    //num =2; This would throw an error because it is declared as final means its value cannot be  changed after decalaration

   }
    
}