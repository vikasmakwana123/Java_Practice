package Java_basics.RunTimePoly;

/*
Dynamic Method Dispatch (Runtime Polymorphism) Example:

- `show()` is defined in class A and overridden in classes B and C.
- Reference type is `A`, but the actual object assigned at runtime decides 
  which `show()` method executes.
- This demonstrates **runtime polymorphism**:
    A obj = new A();   // Calls A's show() → "In A"
    obj = new B();     // Calls B's show() → "In B"
    obj = new C();     // Calls C's show() → "In B"

Key Point:
Method call is resolved at **runtime** based on the object type, 
not the reference type. This is called *Dynamic Method Dispatch*.
*/

class A{
    public void show(){
        System.out.println("In A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B");
    }
}

class C extends A{
    public void show(){
        System.out.println("In B");
    }
}

class D{
      public void show(){
        System.out.println("In D");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        //obj =new D;   
        //This would throw an error because the class D is not in heriting the class A and the Variable created is of type A
    }
    
}
