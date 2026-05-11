class A extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(" Hii From A");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }

        }

    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(" Hello From B");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }
        }

    }
}

public class ThreadPriorityAndSleep {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());
        // priority of thread goes from 1 -10, 1 means least priority and 10 means
        // highest priority

        obj1.setPriority(3);
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
    }
}
