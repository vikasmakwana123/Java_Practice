package Java_basics.Encapsulation;

class Human{

    private int age;//no one outside this class can access this variable
    private String name;

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

public class Encapsulation {

    public static void main(String[] args) {
        Human h1= new Human();
        //h1.age=23; // this will throw an error
        //h1.name="Vikas"; // this will also throw an error

        h1.setAge(23);
        h1.setName("Vikas");

        System.out.println("Age:-"+h1.getAge());
        System.out.println("Name:-"+h1.getName());
    }
}
