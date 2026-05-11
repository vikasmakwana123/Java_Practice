class A {
    int age;

    public void show() {
        System.out.println("In show of A");
    }



    static class C {// We Can only create a staic class only if its and inner class
        public void config() {
            System.out.println("In config of C");
        }
    }
}

// class B extends A {
//         public void show() {
//             System.out.println("In show of B");
//         }
//     } Why should we create a new class if a method is only used once 

public class Anonymous {

    public static void main(String[] args) {
        A obj = new A()
        {
            public void show(){
                System.out.println("In show of Anonymous class");
            }
        };
        obj.show();

    }
}
