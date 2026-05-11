abstract class A{
    public abstract void show();
}


class B extends A{
    public void show(){
        System.out.println("In show of B Class");
    }
}


public class AbAndAn {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        A obj1 = new A(){//This is anonymous class for an abstract class
            public void show (){
                System.out.println("In show of Anonymous class");
            }
        };
        obj1.show();
    }
}
