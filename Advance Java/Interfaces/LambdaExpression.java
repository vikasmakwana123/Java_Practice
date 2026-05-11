
@FunctionalInterface
interface A {
    void show();
}

@FunctionalInterface
interface D {
    void show(int i);
}

class B implements A {
    public void show() {
        System.out.println("In B show");
    }
}

public class LambdaExpression {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In show Of A Obj");
            }
        };
        obj.show();

        A obj2 = () -> System.out.println("In show Of A Obj");
        // -> This is called as a lambda expression in java it reduces the work to write
        // the new A(){public void show()} and cann only be used in Functional
        // interfaces /Single abstract method interfaces

        obj2.show();

        D objWithParam = (int i)-> {
                System.out.println("In show Of D Obj"+ i);
            
        };
        D objWithParam1 = (i)-> {
                System.out.println("In show Of D Obj"+ i);
            
        };
        D objWithParam2 = i -> {
                System.out.println("In show Of D Obj"+ i);
            
        };
        objWithParam.show(30);
        


        A obj1 = new B();
        obj1.show();

    }
}
