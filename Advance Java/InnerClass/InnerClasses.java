
class A{
        int age;
    public void show(){
        System.out.println("This is the outer class method");
    }
    class B{
        public void config(){
            System.out.println("In config of B");
        }
    }

    static class C{//We Can only create a staic class only if its and inner class 
        public void config(){
            System.out.println("In config of C");
        }
    }
}

public class InnerClasses {
public static void main(String[] args) {
    A obj = new A();
    obj.show();

    A.B obj1 = obj.new B();
    obj1.config();

    A.C obj2 = new A.C();//To create an object of static class we can create it directly without creating an object of outer class
    obj2.config();
}
}
