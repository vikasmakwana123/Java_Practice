package Java_basics.Static;

class Mobile {
    String brand;
    int price;
    static String name;
    //static makes the variable name common for all the objects of the class Mobile

    public void display(){
        System.out.println("Brand:-"+brand);
        System.out.println("Price:-"+price);
        System.out.println("Name:-"+name);
    }

    public static void display1(){
        // System.out.println("Brand:-"+brand);
        // System.out.println("Price:-"+price); //Throws an error because we cannot access non static variable in a static method
        System.out.println("Name:-"+name);
    }

    public static void display2(Mobile obj){
        System.out.println("Brand:-"+obj.brand);
        System.out.println("Price:-"+obj.price); //Throws an error because we cannot access non static variable in a static method
        System.out.println("Name:-"+name);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 100000;
        m1.name = "Iphone 14 Pro Max";

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 80000;
        m2.name = "Samsung Galaxy S23 Ultra";

        Mobile.name = "This is a static variable";

        m1.display();
        
        
    }
}
