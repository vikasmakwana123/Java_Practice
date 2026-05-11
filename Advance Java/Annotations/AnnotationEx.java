package Annotations;

class A {
    public void show (){
        System.out.println("In A show" );
    }
}
class B extends A {
    //@Override This shows an error because there is no method named shows in super class 
    public void shows (){
        System.out.println("In A show" );
    }
}
public class AnnotationEx {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
