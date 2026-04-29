package Java_basics.Static;

class Mobile {
    String brand;
    int price;
    static String name;
    // static makes the variable name common for all the objects of the class Mobile

    static{//This block will be executed only once when the class is loaded in the memory
        name = "This is a static variable";
        System.out.println("Static block is executed");
    }
    public Mobile(){
        this.brand = "No brand";
        this.price = 0;
        //this.name = "No name";// this will be executed when the object of the class Mobile is created
        //so when we create an new object every time the name variable will be assigned the value "No name" and it will override the previous value of name variable
        //it would run again and again 
    }
    public void display() {
        System.out.println("Brand:-" + brand);
        System.out.println("Price:-" + price);
        System.out.println("Name:-" + name);
    }
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 100000;
        m1.name = "Iphone 14 Pro Max";
        
        Class.forName("Java_basics.Static.Mobile");// this will load the class Mobile in the memory and execute the static block

        m1.display();
        
    }
}
