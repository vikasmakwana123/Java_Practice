package Java_basics.ObjectClass;

class Laptop{
     String name;
     int price;
}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.name= "lenovo Laptop";
        obj.price=50000;
        System.out.println(obj.toString());
    }
}
