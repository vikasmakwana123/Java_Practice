package Java_basics.Inheritance;
 

class Calc{

    public int add(int a , int b ){
        return a+b;
    }
    public int sub(int a , int b ){
        return a-b;
    }
}

class AdvCalc extends Calc{//Single level inheritance
    
    public int mul(int a , int b){
        return a*b;
    }

    public int div(int a , int b){
        return a/b;
    }


}

class veryAdvCalac extends advCalc{ //Multi level inheritance
    public int mod(int a , int b){
        return a%b;
    }
    public int rectArea(int length , int breath){
        return length*breath;
    }
}


public class SingleVsMultilevel {

    public static void main(String[] args) {
        veryAdvCalac vac = new veryAdvCalac();
        System.out.println(vac.mod(10,3));
        System.out.println(vac.rectArea(10,20));
        System.out.println(vac.mul(10,20));
        System.out.println(vac.div(20,10));
        System.out.println(vac.add(32,334));
        System.out.println(vac.sub(235,23));
    }
    
}
