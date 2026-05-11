package Interfaces;

interface Computer{
    void code();
}

class Laptop implements Computer {
    public void code(){
        System.out.println("code,compile,run");
    }
}
class Desktop implements Computer {
    public void code(){
        System.out.println("code,compile,run");
    }
}

class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
    public void devApp1(Laptop lap){
        lap.code();// if we do this we cannot call the method of desktop means it can only use laptop method
        //This make the code tightly coupled and less flexible
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Laptop lap1 = new Laptop();
        Desktop desk1 = new Desktop();

        Developer vikas = new Developer();
        vikas.devApp(lap);
        vikas.devApp(desk);

        vikas.devApp1(lap1);
        //vikas.devApp1(desk1); Cannot pass object having a refrence of another type rather than that of laptop



    }
}
