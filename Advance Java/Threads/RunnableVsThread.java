

class B implements Runnable // This is super class of the Class Thread and it is an interface with method run
{
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(" Hello From B");}
        }
}

public class RunnableVsThread {
    public static void main(String[] args) {
        Runnable obj1 = ()-> {
                for (int i = 1; i <= 20; i++) {
                    System.out.println(" Hii From A");
                    try {Thread.sleep(10);} catch (Exception e) {System.out.println(e.getStackTrace());}
                }};
        B obj2 = new B();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
