package Java_basics.AnonymousObjects;

class Student{
    String name;
    int age;

    public Student(){
        System.out.println("Constructor is called");
    }

    public void display(){
        System.out.println("Name:-"+name);
        System.out.println("Age:-"+age);
    }
}


public class AnonymousObj {
    public static void main(String[] args) {
        Student s1;//This is called as a refrenece variable which can hold the address of the object
        System.out.println();
        System.out.println();
        
        s1 = new Student();//This is called as an object of the class Student

        s1.display();
        System.out.println();
        System.out.println();

        new Student();//This part alone is called as a anonymous object because it does not have a reference variable to hold its address
        System.out.println();
        System.out.println();
        new Student().display();//we can also call the method of the anonymous object by using the dot operator
    }
}
