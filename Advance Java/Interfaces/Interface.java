//class(Inherits) - class ->extends
//class - interface --> implements
//interface - interface --> extends
interface A{

    int age=20 ;    //All variables in interfaces are final and static
    String area="Mumbai";
    public abstract void show();
    void config();// by default all the methods in an interface are public abstract
}

interface X{
    void run ();
}

interface Y extends X{

}

class B implements A,X {
    public void show(){
        System.out.println("This is show method");
    }
    public void config (){
        System.out.println("This is config method");
    }

    public void run(){
        System.out.println("In run method of class B");
    }
}


public class Interface {
    public static void main(String[] args) {
        A obj ;
        //obj = new A(); Will throw an error because we cannot create an object of an interface because it works same as abstract class
        
        obj = new B();
        obj.show();
        
        System.out.println(A.area);
   
    }
    
}