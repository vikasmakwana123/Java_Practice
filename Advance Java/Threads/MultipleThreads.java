class A extends Thread {
    public void run (){
        for ( int i = 1 ; i<=100; i++){
            System.out.println(" Hii From A");
        }
        
    }
}
class B extends Thread{
    public void run (){
        for ( int i = 1 ; i<=100; i++){
            System.out.println(" Hello From B");
        }
        
    }
}
//Every Thread should have a run method in it to run it as a thread parallely

public class MultipleThreads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 =new B();

        obj1.start();//Intializing threads By using start method for we to intialize the thread the class first need to extend thread
        obj2.start();
        
    }
}
