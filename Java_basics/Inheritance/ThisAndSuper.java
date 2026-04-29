
class A {
    public A() {
        System.out.println("In A");
    }

    public A(int x) {
        System.out.println("in A integer");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("In B");
    }

    public B(int x) {
        //super(x);//Calling the parametarized contructor of A
        
        this(); //Executes the contructor of same class 
        // calling non-parameterized contructor of the b class 
        System.out.println("in B integer");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        B obj = new B(4);
    }
}
