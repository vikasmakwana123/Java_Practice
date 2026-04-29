package Java_basics.Constructor;

class Human{

    private int age;//no one outside this class can access this variable
    private String name;

    public Human(){//default constructor
        System.out.println("Inside the constructor");
        age=23;
        name="Vikas";
    }

    //Constructor Overloading
    public Human(int age , String name){
        this.age=age;
        this.name=name;
    }

    //we can provide share the age variable by creating a method for it
    //Getters 

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
    //Setters
    //we can also set the value of age and name by creating a method for it
    public void setAge(int age){
        this.age=age;
        //this keyword represent the current object of the class
    }

    public void setName(String name){
        this.name=name;
    }

}

public class Constructor {
    public static void main(String[] args) {
        Human h1 = new Human(23,"Vikaaas");
        System.out.println("Age:-"+h1.getAge());
        System.out.println("Name:-"+h1.getName());

         Human h2 = new Human();
        System.out.println("Default Age:-"+h2.getAge());
        System.out.println("Default Name:-"+h2.getName());
    }
}
