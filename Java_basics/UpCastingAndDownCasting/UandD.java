package Java_basics.UpCastingAndDownCasting;

class A{
    public void show(){
        System.out.println("In a ");
    }
}

class B extends A{
    public void show1(){
        System.out.println("In B ");
    }
}
public class UandD {
    public static void main(String[] args) {
        float a =10.5f;
        int b = (int)a; //type Casting
        System.out.println(b);

        A obj = (A) new B();
        obj.show();//Upcasting

       // obj.show1(); class A does not have method name show1

       B obj1 = (B) obj;//converting the obj object type to B type 
       obj1.show1();
       //DownCasting


    }
    
}
