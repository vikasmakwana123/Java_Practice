package Interfaces;

@FunctionalInterface
interface A{
    void show();
}

class B implements A {
    public void show(){
        System.out.println("In B show");
    }
}

public class SAMOrFunctionalInterface {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("In show Of A Obj");
            }
        };
        obj.show();
        A obj1 = new B();

        obj1.show();

    }
    
}
