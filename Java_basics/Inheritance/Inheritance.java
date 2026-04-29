package Java_basics.Inheritance;


// Parent --> Child
// Super--> Sub
// base class --> derived class


class Calc{

    public int add(int a , int b ){
        return a+b;
    }
    public int sub(int a , int b ){
        return a-b;
    }
}

class AdvCalc extends Calc{
    public int mul(int a , int b){
        return a*b;
    }

    public int div(int a , int b){
        return a/b;
    }


}

public class Inheritance {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(10,20));
        System.out.println(c.sub(20,10));

        AdvCalc ac = new AdvCalc();
        System.out.println(ac.mul(10,20));
        System.out.println(ac.div(20,10));
        System.out.println(ac.add(32,334));
        System.out.println(ac.sub(235,23));
    }
}
