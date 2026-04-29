package Java_basics.MethodOverRiding;


class A{
    public void show(){
        System.out.println("This is class A");
    }
}
class B extends A{
      
    public void show(){
        System.out.println("This is class B");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
