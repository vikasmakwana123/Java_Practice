
abstract class Car{
    public abstract void drive();
    public void stop(){
        System.out.println("car stopped successfully");
    }
}

class WagonR extends Car{//concrete class
    public void drive(){
        System.out.println("WagonR is driving");
    }
    public void stop(){
        System.out.println("WagonR stopped successfully");
    }
}


public class Abstract {
    public static void main(String[] args) {
        //Car car = new Car(); Would Throw an error because we cannot create an object of a abstract class 
        // car.drive();
        // car.stop();

        WagonR wagonR = new WagonR();
        wagonR.drive();
        wagonR.stop();
    }
}
